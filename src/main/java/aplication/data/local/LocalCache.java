package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;

import java.util.List;

public interface LocalCache extends  Local {
    void agregarParticipante (String rut, ParticipanteEntity participanteEntity);
    List<ParticipanteEntity> obtenerParticipantes();
}
