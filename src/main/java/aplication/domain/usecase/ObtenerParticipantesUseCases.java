package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ObtenerParticipantesUseCases {

    @Autowired
    private Repository repository;

    public List<ParticipanteModel> obtenerParticipantes() {
        return repository.obtenerParticipantes();
    }


}
