package aplication.data.repository;

import aplication.data.datasource.Datasource;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("repositorioLocal")
public class RepositoryParticipanteLocal implements Repository {

    @Autowired
    @Qualifier("localDataSource")
    private Datasource localDataSource;

    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
        return ParticipanteModelToEntity.reverse(localDataSource.obtenerPartcipante(rut));
    }


}
