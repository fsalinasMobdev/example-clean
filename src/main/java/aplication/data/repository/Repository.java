package aplication.data.repository;

import aplication.domain.model.ParticipanteModel;

import java.util.List;

public interface Repository {
    ParticipanteModel obtenerParticipante(String rut);

    List<ParticipanteModel> listarParticipantes();
}
