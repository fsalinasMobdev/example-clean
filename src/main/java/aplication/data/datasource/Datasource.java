package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;

public interface Datasource {
    ParticipanteEntity obtenerPartcipante(String rut);

    void addParticipante(String rut, ParticipanteEntity participanteEntity);
}
