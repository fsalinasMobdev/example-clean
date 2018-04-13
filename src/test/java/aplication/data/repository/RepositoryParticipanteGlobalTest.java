package aplication.data.repository;

import aplication.data.datasource.DataSourceLocal;
import aplication.data.datasource.Datasource;
import aplication.data.datasource.LocalDataSource;
import aplication.data.entity.ParticipanteEntity;
import aplication.data.exceptions.NoResultApiExceptions;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RepositoryParticipanteGlobalTest {

    @Mock
    private LocalDataSource localDataSource;

    @Mock
    private Datasource apiDataSource;

    @InjectMocks
    private RepositoryParticipanteGlobal repositoryParticipanteGlobal;



    @Test(expected = NoResultApiExceptions.class)
    public void deberiaLanzarExcepcionAPInoRetornaResultado() throws NoResultApiExceptions {
        String rutBuscado="10-2";
        ParticipanteEntity participante = null ;

        when(apiDataSource.obtenerPartcipante(rutBuscado)).thenReturn(participante);

        repositoryParticipanteGlobal.obtenerParticipante(rutBuscado);

    }


}