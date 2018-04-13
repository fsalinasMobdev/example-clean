package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.data.repository.RepositoryCache;
import aplication.data.repository.RepositoryListaCache;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtenerParticipantesCacheUseCases {

    @Autowired
    @Qualifier("repositorioListadoCache")
    private RepositoryListaCache repository;

    public List<ParticipanteModel> obtenerParticipantes() {
        return repository.obtenerParticipantesCache();
    }
}
