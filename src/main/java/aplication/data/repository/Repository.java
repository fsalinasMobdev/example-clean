package aplication.data.repository;

import aplication.data.exceptions.NoResultApiExceptions;
import aplication.domain.model.ParticipanteModel;

import java.util.List;

public interface Repository {
    ParticipanteModel obtenerParticipante(String rut) throws NoResultApiExceptions;
    List<ParticipanteModel> obtenerAllParticipantes();
}
