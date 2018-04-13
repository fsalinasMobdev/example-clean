package aplication.data.repository;

import aplication.data.datasource.Datasource;
import aplication.data.entity.ParticipanteEntity;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("repositorioLocal")
public class RepositoryParticipanteLocal implements Repository {

    @Autowired
    @Qualifier("localDataSource")
    private Datasource localDataSource;

    @Autowired
    @Qualifier("apiDataSource")
    private Datasource apiDataSource;


    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
        ParticipanteEntity participanteEntity = localDataSource.obtenerPartcipante(rut);

        if ( participanteEntity == null ) {
            participanteEntity = apiDataSource.obtenerPartcipante(rut);
            localDataSource.addParticipante(rut, participanteEntity);
        }
        ParticipanteModel participanteModel =
             ParticipanteModelToEntity.reverse(participanteEntity);


        return participanteModel;
    }


}
