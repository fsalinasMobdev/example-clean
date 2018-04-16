package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;

import java.util.ArrayList;
import java.util.List;

public interface Local {
    ParticipanteEntity obtenerPartcipante(String rut);
    void CargarParticipantes(String rut, ParticipanteEntity nombre);
    public List<ParticipanteEntity> listarParticipantes();

}
