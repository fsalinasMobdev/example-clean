package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;

import java.util.List;

public interface DataSourceLocal extends  Datasource{
     void agregarParticipante(ParticipanteEntity participanteEntity, String rut);
     List<ParticipanteEntity> obtenerAllParticipantes();
}
