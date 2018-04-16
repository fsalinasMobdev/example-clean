package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;

public interface DatasourceLocal {
    ParticipanteEntity obtenerPartcipante(String rut);
    void CargarParticipantes(String rut, ParticipanteEntity nombre);
    void listarParticipantes();
}
