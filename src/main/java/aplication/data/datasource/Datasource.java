package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;

import java.util.List;

public interface Datasource {
    List<ParticitanteEntity> obtenerPartcipantes(String rut);
}
