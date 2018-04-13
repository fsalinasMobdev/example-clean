package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;

import java.util.List;

public interface DatasourceLocal {
    ParticipanteEntity obtenerPartcipante(String rut);
    List<ParticipanteEntity> obtenerParticipantes();
}
