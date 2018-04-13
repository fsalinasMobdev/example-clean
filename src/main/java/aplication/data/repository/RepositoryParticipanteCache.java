package aplication.data.repository;

import aplication.data.datasource.DatasourceApi;
import aplication.data.datasource.DatasourceLocal;
import aplication.data.entity.ParticipanteEntity;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("repositorioCache")
public class RepositoryParticipanteCache implements Repository {

    @Autowired
    @Qualifier("localDataSource")
    private DatasourceLocal localDataSource;

    @Autowired
    @Qualifier("apiDataSource")
    private DatasourceApi apiDataSource;

    ParticipanteEntity nombre;
    ParticipanteEntity nombreTmp;


    @Override
    public ParticipanteModel obtenerParticipante(String rut) {

        nombre = localDataSource.obtenerPartcipante(rut);

        if(nombre==null){
            nombre = apiDataSource.obtenerPartcipante(rut);

            if(nombre!=null){
                nombreTmp = apiDataSource.obtenerPartcipante(rut);
                nombreTmp.setNombre("Prueba de nombre");
                localDataSource.ingresarPartcipante(rut, nombreTmp);
            }
            return ParticipanteModelToEntity.reverse(nombre);

        }else{
            return ParticipanteModelToEntity.reverse(nombre);
        }

    }


}
