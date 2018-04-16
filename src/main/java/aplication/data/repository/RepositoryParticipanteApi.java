package aplication.data.repository;

import aplication.data.datasource.DatasourceApi;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("repositorioApi")
public class RepositoryParticipanteApi implements Repository {

    @Autowired
    @Qualifier("apiDataSource")
    private DatasourceApi apiDataSource;

    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
        return ParticipanteModelToEntity.reverse(apiDataSource.obtenerPartcipante(rut));
    }

    @Override
    public List<ParticipanteModel> listarParticipantes() {
        return null;
    }
}
