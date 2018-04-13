package aplication.data.datasource;

import aplication.data.api.Api;
import aplication.data.entity.ParticipanteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("apiDataSource")
public class ApiDataSource implements Datasource {

    @Autowired
    private Api participantApi;

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        return participantApi.obtenerPartcipante(rut);
    }

    @Override
    public void addParticipante(String rut, ParticipanteEntity participanteEntity) {
       // TOD generar una excepcion, la api no permite crear participantes
    }
}
