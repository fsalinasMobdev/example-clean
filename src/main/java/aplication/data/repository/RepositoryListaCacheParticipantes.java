package aplication.data.repository;

import aplication.data.datasource.DataSourceCache;
import aplication.data.datasource.Datasource;
import aplication.data.entity.ParticipanteEntity;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("repositorioListadoCache")
public class RepositoryListaCacheParticipantes implements RepositoryListaCache {

    @Autowired
    @Qualifier("localDataSourceCache")
    private DataSourceCache localDataSourceCache;


    public List<ParticipanteModel> obtenerParticipantesCache() {
        return ParticipanteModelToEntity.reverse(localDataSourceCache.obtenerParticipantes());
    }
}
