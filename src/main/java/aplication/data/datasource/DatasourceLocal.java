package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;

import java.util.List;

public interface DatasourceLocal {
    ParticipanteEntity obtenerPartcipante(String rut);
    boolean ingresarPartcipante(String rut, ParticipanteEntity nombre);
    List<ParticipanteEntity> obtenerPartcipantes();
}
