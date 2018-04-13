package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.data.repository.RepositoryAll;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtenerParticipanteUseCases {

    @Autowired
    @Qualifier("repositorioCache")
    private Repository repository;

    @Autowired
    @Qualifier("repositorioLocal")
    private Repository repositoryLocal;

    @Autowired
    @Qualifier("repositorioLocalAll")
    private RepositoryAll repositoryLocalAll;

    public ParticipanteModel obtenerParticipante(String rut) {
        return repository.obtenerParticipante(rut);
    }

    public List<ParticipanteModel> obtenerParticipantes() {
        return repositoryLocalAll.obtenerParticipantes();
    }
}
