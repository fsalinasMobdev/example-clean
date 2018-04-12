package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ObtenerParticipanteUseCases {

    @Autowired
    @Qualifier("repositorioApi")
    private Repository repository;

    public ParticipanteModel obtenerParticipante(String rut) {
        return repository.obtenerParticipante(rut);
    }
}
