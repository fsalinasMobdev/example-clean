package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;

import java.util.List;

public interface DataSourceCache extends Datasource {
    void agregarParticipante(String rut, ParticipanteEntity participanteEntity);
    List<ParticipanteEntity> obtenerParticipantes();
}
