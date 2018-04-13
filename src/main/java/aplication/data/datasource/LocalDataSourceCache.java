package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;
import aplication.data.local.Local;
import aplication.data.local.LocalCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("localDataSourceCache")
public class LocalDataSourceCache implements DataSourceCache {

    @Autowired
    private LocalCache participantesLocal;

    @Override
    public void agregarParticipante(String rut, ParticipanteEntity participanteEntity) {
        participantesLocal.agregarParticipante(rut, participanteEntity);
    }

    @Override
    public List<ParticipanteEntity> obtenerParticipantes() {
        return participantesLocal.obtenerParticipantes();
    }

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        return participantesLocal.obtenerPartcipante(rut);
    }
}
