package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;

import java.util.List;

public interface Local {
    ParticipanteEntity obtenerPartcipante(String rut);

    List<ParticipanteEntity> obtenerParticipantes();

    void addParticipante (ParticipanteEntity participante);
}
