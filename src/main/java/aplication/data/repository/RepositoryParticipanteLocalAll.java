package aplication.data.repository;

import aplication.data.datasource.DatasourceLocal;
import aplication.data.datasource.DatasourceLocalAll;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("repositorioLocalAll")
public class RepositoryParticipanteLocalAll implements RepositoryAll {

    @Autowired
    @Qualifier("localDataSourceAll")
    private DatasourceLocalAll localDataSourceAll;


    @Override
    public List<ParticipanteModel> obtenerParticipantes() {
        return ParticipanteModelToEntity.reverseAll(localDataSourceAll.obtenerPartcipantes());
    }
}
