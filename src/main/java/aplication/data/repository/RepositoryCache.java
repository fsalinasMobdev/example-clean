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
@Qualifier("repositorioCache")
public class RepositoryCache implements Repository {


    @Autowired
    @Qualifier("localDataSource")
    private Datasource localDataSource;


    @Autowired
    @Qualifier("localDataSourceCache")
    private DataSourceCache localDataSourceCache;

    @Autowired
    @Qualifier("apiDataSource")
    private Datasource apiDataSource;


    @Override
    public ParticipanteModel obtenerParticipante(String rut) {

        ParticipanteModel participanteModel;
        ParticipanteEntity participanteEntity;
        ParticipanteEntity participanteEntityCache;
        participanteEntity = localDataSourceCache.obtenerPartcipante(rut);
        if (participanteEntity == null) {
            participanteEntity = apiDataSource.obtenerPartcipante(rut);
            participanteEntityCache = new ParticipanteEntity();
            participanteEntityCache.setNombre(participanteEntity.getNombre() + " (En Cache)");
            localDataSourceCache.agregarParticipante(rut, participanteEntityCache);
        }

        participanteModel = ParticipanteModelToEntity.reverse(participanteEntity);


        return participanteModel;
    }

}
