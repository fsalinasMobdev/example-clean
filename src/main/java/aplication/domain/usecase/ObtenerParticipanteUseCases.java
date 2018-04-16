package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtenerParticipanteUseCases {

    @Autowired
    @Qualifier("repositorioCache")
    private Repository repositoryCache;


    public ParticipanteModel obtenerParticipante(String rut) {
        return repositoryCache.obtenerParticipante(rut);
    }

    public List<ParticipanteModel> listarParticipantes(){
        return repositoryCache.listarParticipantes();
    }

}
