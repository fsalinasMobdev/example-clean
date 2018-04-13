package aplication.data.repository;

import aplication.data.datasource.Datasource;
import aplication.data.datasource.DataSourceLocal;
import aplication.data.entity.ParticipanteEntity;
import aplication.data.exceptions.NoResultApiExceptions;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("repositorioGlobal")
public class RepositoryParticipanteGlobal implements Repository {

    @Autowired
    @Qualifier("localDataSource")
    private DataSourceLocal localDataSource;

    @Autowired
    @Qualifier("apiDataSource")
    private Datasource apiDataSource;

    @Override
    public ParticipanteModel obtenerParticipante(String rut) throws NoResultApiExceptions {

        ParticipanteEntity participante ;
        participante = localDataSource.obtenerPartcipante(rut);

        if(participante == null){
            participante = apiDataSource.obtenerPartcipante(rut);

            if(participante != null) {
                localDataSource.agregarParticipante(participante, rut);
            }else{
                throw new NoResultApiExceptions("Rut no encontrado en la API");
            }

        }

        return ParticipanteModelToEntity.reverse(participante);
    }

    @Override
    public List<ParticipanteModel> obtenerAllParticipantes() {
        List<ParticipanteModel> listadoModel = new ArrayList<>();
        List<ParticipanteEntity> listado = localDataSource.obtenerAllParticipantes();

        for(ParticipanteEntity participanteEntity : listado){
            listadoModel.add(ParticipanteModelToEntity.reverse(participanteEntity));
        }
        return listadoModel;
    }


}
