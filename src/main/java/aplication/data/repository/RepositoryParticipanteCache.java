package aplication.data.repository;

import aplication.data.datasource.ApiDataSource;
import aplication.data.datasource.Datasource;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("repositorioCache")
public class RepositoryParticipanteCache implements Repository {

    @Autowired
    @Qualifier("localDataSource")
    private Datasource localDataSource;

    @Autowired
    @Qualifier("apiDataSource")
    private ApiDataSource apiDataSource;

    public RepositoryParticipanteCache() {
    }

    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
       int statusParticipanteLocal = 0;
       int statusParticipanteRemoto = 0;
        int statusCreadoLocal = 0;

        System.out.println("============= Iniciando busqueda de usuario =============");
        try {
            ParticipanteModel BuscarParticipanteLocal = ParticipanteModelToEntity.reverse(localDataSource.obtenerPartcipante(rut));
            String NombreParticipante = BuscarParticipanteLocal.getNombre();
            System.out.println("Usuario Encontrado en local:" + NombreParticipante);
            return BuscarParticipanteLocal;
        }
       catch(NullPointerException e)
        {
            statusParticipanteLocal = 1;
        }

        if (statusParticipanteLocal == 1){
            System.out.println("Usuario NO ENCONTRADO EN LOCAL... buscando en API");
            try {
                ParticipanteModel BuscarParticipanteLocal = ParticipanteModelToEntity.reverse(apiDataSource.obtenerPartcipante(rut));
                String NombreParticipante = BuscarParticipanteLocal.getNombre();
                System.out.println("Usuario Encontrado en API:" + NombreParticipante);
                statusParticipanteRemoto = 0;
                //Aqui deberia agregarlo al repositorio local
                ParticipanteModelToEntity.reverse(localDataSource.crearPartcipante(rut));
                statusCreadoLocal = 0;
                System.out.println("Usuario Creado en LOCAL ...("+rut+")");
                return BuscarParticipanteLocal;
            }
            catch(NullPointerException e)
            {
                statusParticipanteRemoto = 1;
                statusCreadoLocal = 1;
            }
            if (statusParticipanteRemoto == 1 && statusParticipanteLocal == 1 && statusCreadoLocal != 1) {
                System.out.println("Usuario NO ENCONTRADO EN LOCAL NI EN REMOTO ...");
            }
        }

        System.out.println("============= Fin de Busqueda =============");
        return ParticipanteModelToEntity.reverse(localDataSource.obtenerPartcipante("0000000000"));

    }
}
