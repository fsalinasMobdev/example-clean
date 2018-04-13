package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;

public interface Datasource {
    ParticipanteEntity obtenerPartcipante(String rut);
    ParticipanteEntity crearPartcipante(String rut);
}
