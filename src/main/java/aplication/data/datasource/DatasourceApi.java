package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;

public interface DatasourceApi {
    ParticipanteEntity obtenerPartcipante(String rut);
}
