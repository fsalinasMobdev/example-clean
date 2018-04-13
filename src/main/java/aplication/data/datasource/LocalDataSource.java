package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;
import aplication.data.local.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("localDataSource")
public class LocalDataSource implements DataSourceLocal {

    @Autowired
    private Local participantesLocal;

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        return participantesLocal.obtenerPartcipante(rut);
    }

    @Override
    public void agregarParticipante(ParticipanteEntity participanteEntity, String rut) {
        participantesLocal.agregarParticipante(participanteEntity,rut);
    }

    @Override
    public List<ParticipanteEntity> obtenerAllParticipantes() {
        return participantesLocal.obtenerAllParticipantesLocales();
    }
}
