package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;

import java.util.List;

public interface Local {
    ParticipanteEntity obtenerPartcipante(String rut);
    void agregarParticipante(ParticipanteEntity participanteEntity, String rut);

    List<ParticipanteEntity> obtenerAllParticipantesLocales();
}
