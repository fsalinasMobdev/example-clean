package aplication.domain.usecase;

import aplication.data.exceptions.NoResultApiExceptions;
import aplication.data.repository.Repository;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtenerParticipanteUseCases {

    @Autowired
    @Qualifier("repositorioGlobal")
    private Repository repositoryGlobal;


    public ParticipanteModel obtenerParticipante(String rut) throws NoResultApiExceptions {
        return repositoryGlobal.obtenerParticipante(rut);
    }

    public List<ParticipanteModel> obtenerAllParticipanates(){
        return repositoryGlobal.obtenerAllParticipantes();
    }





}
