package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;

public interface Local {
    ParticipanteEntity obtenerPartcipante(String rut);
    void crearPartcipante(String rut);
}
