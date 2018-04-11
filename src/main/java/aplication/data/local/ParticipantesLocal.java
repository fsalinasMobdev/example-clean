package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Component
public class ParticipantesLocal implements Local {

    @Override
    public List<ParticitanteEntity> obtenerPartcipantes(String rut) {

        String usuario;
        String rutUsuario;


        HashMap<String,String> listaParticipantes = new HashMap<String,String>();
        listaParticipantes.put("259139430", "Fernando Rodriguez");
        listaParticipantes.put("259139431", "Jesus Mendoza");

        Iterator<String> participante = listaParticipantes.keySet().iterator();
        List participantes = new ArrayList();
        ParticitanteEntity particitanteEntity = new ParticitanteEntity();

        particitanteEntity.setNombre(listaParticipantes.get(rut));
        participantes.add(particitanteEntity);

        /*List participantes = new ArrayList();
        ParticitanteEntity particitanteEntityUno = new ParticitanteEntity();
        particitanteEntityUno.setNombre("Fernand Rodriguez RUT:"+rut);

        ParticitanteEntity particitanteEntityDos = new ParticitanteEntity();
        particitanteEntityDos.setNombre("Constanza Salinas");

        ParticitanteEntity particitanteEntityTres = new ParticitanteEntity();
        particitanteEntityTres.setNombre("Luis Avalos");

        ParticitanteEntity particitanteEntityCuatro = new ParticitanteEntity();
        particitanteEntityCuatro.setNombre("Nadia Poniatowsky");

        participantes.add(particitanteEntityUno);
        participantes.add(particitanteEntityDos);
        participantes.add(particitanteEntityTres);
        participantes.add(particitanteEntityCuatro);*/



        return participantes;
    }
}
