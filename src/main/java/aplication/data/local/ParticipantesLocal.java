package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ParticipantesLocal implements Local {
    private Map<String, ParticipanteEntity> participantes = new HashMap<>();

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        CargarParticipantes();
        return participantes.get(rut);
    }

    @Override
    public void addParticipante(String rut, ParticipanteEntity participanteEntity ) {
        participantes.put(rut, participanteEntity);
    }

    private void CargarParticipantes() {
        ParticipanteEntity participanteEntityUno = new ParticipanteEntity();
        participanteEntityUno.setNombre("Ileyn Avalos");

        ParticipanteEntity participanteEntityDos = new ParticipanteEntity();
        participanteEntityDos.setNombre("Constanza Salinas");

        ParticipanteEntity participanteEntityTres = new ParticipanteEntity();
        participanteEntityTres.setNombre("Luis Avalos");

        ParticipanteEntity participanteEntityCuatro = new ParticipanteEntity();
        participanteEntityCuatro.setNombre("Nadia Poniatowsky");

        participantes.put("1-0", participanteEntityUno);
        participantes.put("2-0", participanteEntityDos);
        participantes.put("3-0", participanteEntityTres);
        participantes.put("4-0", participanteEntityCuatro);
    }


}
