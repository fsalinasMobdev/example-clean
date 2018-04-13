package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ParticipantesLocalCache implements LocalCache {

    private Map<String, ParticipanteEntity> participantes = new HashMap<>();

    @Override
    public void agregarParticipante(String rut, ParticipanteEntity participanteEntity) {
        participantes.put(rut, participanteEntity);
    }

    @Override
    public List<ParticipanteEntity> obtenerParticipantes() {
        return new ArrayList<>(participantes.values());
    }


    ParticipantesLocalCache() {
        CargarParticipantes();
    }

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        return participantes.get(rut);
    }

    private void CargarParticipantes() {
        ParticipanteEntity participanteEntityUno = new ParticipanteEntity();
        participanteEntityUno.setNombre("Ileyn Avalos LocalCache");

        ParticipanteEntity participanteEntityDos = new ParticipanteEntity();
        participanteEntityDos.setNombre("Constanza Salinas LocalCache");

        ParticipanteEntity participanteEntityTres = new ParticipanteEntity();
        participanteEntityTres.setNombre("Luis Avalos LocalCache");

        ParticipanteEntity participanteEntityCuatro = new ParticipanteEntity();
        participanteEntityCuatro.setNombre("Nadia Poniatowsky LocalCache");

        participantes.put("1-0", participanteEntityUno);
        participantes.put("2-0", participanteEntityDos);
        participantes.put("3-0", participanteEntityTres);
        participantes.put("4-0", participanteEntityCuatro);
    }
}
