package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;
import aplication.data.local.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("localDataSourceAll")
public class LocalDataSourceAll implements DatasourceLocalAll {

    @Autowired
    private Local participantesLocal;

    @Override
    public List<ParticipanteEntity> obtenerPartcipantes() {
        return participantesLocal.obtenerPartcipantes();
    }


}
