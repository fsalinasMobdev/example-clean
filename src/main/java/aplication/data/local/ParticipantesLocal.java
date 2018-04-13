package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ParticipantesLocal implements Local {
    private Map<String, ParticipanteEntity> participantes = new HashMap<>();


    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        CargarParticipantes();
           return participantes.get(rut);

    }


    private void CargarParticipantes() {
        ParticipanteEntity participanteEntityUno = new ParticipanteEntity();
        participanteEntityUno.setNombre("Fernando Rodriguez");

        ParticipanteEntity participanteEntityDos = new ParticipanteEntity();
        participanteEntityDos.setNombre("Constanza Salinas");

        ParticipanteEntity participanteEntityTres = new ParticipanteEntity();
        participanteEntityTres.setNombre("Luis Avalos");

        ParticipanteEntity participanteEntityCuatro = new ParticipanteEntity();
        participanteEntityCuatro.setNombre("Nadia Poniatowsky");

        participantes.put("25913943-0", participanteEntityUno);
        participantes.put("2-0", participanteEntityDos);
        participantes.put("3-0", participanteEntityTres);
        participantes.put("4-0", participanteEntityCuatro);
    }

    @Override
    public boolean ingresarPartcipante(String rut, ParticipanteEntity nombre){
        participantes.put(rut, nombre);
        return true;

    }

    @Override
    public List<ParticipanteEntity> obtenerPartcipantes() {
        List Listparticipantes = new ArrayList();

        /*Iterator it = participantes.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry ent = (Map.Entry)it.next();
            Listparticipantes.add(ent.getValue());
        }*/

        ParticipanteEntity participanteEntityUno = new ParticipanteEntity();
        participanteEntityUno.setNombre("Nombre 1");

        ParticipanteEntity participanteEntityDos = new ParticipanteEntity();
        participanteEntityDos.setNombre("Nombre 2");


        participantes.put("25913943-0", participanteEntityUno);
        participantes.put("2-0", participanteEntityDos);



        return Listparticipantes;
    }

}
