package aplication.data.api;

import aplication.data.entity.ParticipanteEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class ParticipantesApi implements Api {

    private final String HTTPS_API_RUTIFY = "https://api.rutify.cl/search";

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        ParticipanteEntity[] responseApiArray;
        RestTemplate restTemplate = new RestTemplate();
        responseApiArray = restTemplate.getForObject(getUrlSearch(rut), ParticipanteEntity[].class);
        return getParticitanteEntity(responseApiArray);
    }


    private String getUrlSearch(String rut) {
        return HTTPS_API_RUTIFY + "?q=" + rut;
    }

    private ParticipanteEntity getParticitanteEntity(ParticipanteEntity[] responseApiArray) {
        List<ParticipanteEntity> listParticipanteEntity = Arrays.asList(responseApiArray);
        if (listParticipanteEntity.isEmpty()) {
            ParticipanteEntity participanteEntity = new ParticipanteEntity();
            participanteEntity.setNombre("No encontrado en API");
            participanteEntity.setRut("");
            return participanteEntity;
        }
        return listParticipanteEntity.get(0);
    }
}
