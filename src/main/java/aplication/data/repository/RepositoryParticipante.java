package aplication.data.repository;


import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import aplication.data.datasource.DatasourceApi;
import aplication.data.datasource.DatasourceLocal;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Component
public class RepositoryParticipante implements Repository{

    @Autowired
    @Qualifier("localDataSource")
    private DatasourceLocal localDataSource;

    @Autowired
    @Qualifier("apiDataSource")
    private DatasourceApi apiDataSource;


    @Override
    public ParticipanteModel obtenerParticipante(String rut) {

        return ParticipanteModelToEntity.reverse(localDataSource.obtenerPartcipante(rut));
    }

    @Override
    public List<ParticipanteModel> obtenerParticipantes() {
        return ParticipanteModelToEntity.reverse(localDataSource.obtenerParticipantes());
    }



}
