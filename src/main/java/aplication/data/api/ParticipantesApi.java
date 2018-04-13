package aplication.data.api;

import aplication.data.entity.ParticipanteEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ParticipantesApi implements Api {


    private Map<String, ParticipanteEntity> participantes = new HashMap<>();
    ;

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        CargarParticipantes();
        return participantes.get(rut);
    }

    private void CargarParticipantes() {
        ParticipanteEntity participanteEntityUno = new ParticipanteEntity();
        participanteEntityUno.setNombre("RUT API 1-0");

        ParticipanteEntity participanteEntityDos = new ParticipanteEntity();
        participanteEntityDos.setNombre("RUT API 2-0");

        ParticipanteEntity participanteEntityTres = new ParticipanteEntity();
        participanteEntityTres.setNombre("RUT API 3-0");

        ParticipanteEntity participanteEntityCuatro = new ParticipanteEntity();
        participanteEntityCuatro.setNombre("RUT API 4-0");

        ParticipanteEntity participanteEntityCinco = new ParticipanteEntity();
        participanteEntityCinco.setNombre("API Carlos Wistuba");

        participantes.put("1-0", participanteEntityUno);
        participantes.put("2-0", participanteEntityDos);
        participantes.put("3-0", participanteEntityTres);
        participantes.put("4-0", participanteEntityCuatro);
        participantes.put("162782509", participanteEntityCinco);
    }

    //CWG: Este codigo lo tuve que comentar porque al consultar me da un error de certificado
    //lo que me impedia probar si se ejecuta bien o no. Se reemplaza simulando que llamara realmente a API

    /*private final String HTTPS_API_RUTIFY_SEARCH = "http://api.rutify.cl/search?q=";

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        ParticipanteEntity[] responseApiArray;
        RestTemplate restTemplate = new RestTemplate();
        responseApiArray = restTemplate.getForObject(getUrlSearch(rut), ParticipanteEntity[].class);
        return getParticitanteEntity(responseApiArray);
    }

    private String getUrlSearch(String rut) {
        return HTTPS_API_RUTIFY_SEARCH + rut;
    }

    private ParticipanteEntity getParticitanteEntity(ParticipanteEntity[] responseApiArray) {
        List<ParticipanteEntity> listParticipanteEntity = Arrays.asList(responseApiArray);
        if (listParticipanteEntity.isEmpty()) {
            return new ParticipanteEntity();
        }
        return listParticipanteEntity.get(0);
    }
    */

}
