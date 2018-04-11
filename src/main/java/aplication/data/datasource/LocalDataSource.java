package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;
import aplication.data.local.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LocalDataSource implements Datasource {

    @Autowired
    private Local participantesLocal;

    @Override
    public List<ParticitanteEntity> obtenerPartcipantes(String rut) {
        return participantesLocal.obtenerPartcipantes(rut);
    }
}
