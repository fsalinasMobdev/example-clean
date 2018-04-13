package aplication.data.repository;

import aplication.data.datasource.ApiDataSource;
import aplication.data.datasource.LocalDataSource;
import aplication.data.entity.ParticipanteEntity;
import aplication.domain.model.ParticipanteModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class RepositoryParticipanteLocalTest {

    @Mock
    private LocalDataSource localDataSource;

    @Mock
    private ApiDataSource apiDataSource;

    @InjectMocks
    private RepositoryParticipanteLocal repositoryParticipanteLocal = new RepositoryParticipanteLocal();

    @Test
    public void BusquedaExitosaDePersonaPorRut() {

        //arrange
        ParticipanteModel participanteModelSearched = new ParticipanteModel();
        String rutSearched = "8786683-1";
        participanteModelSearched.setNombre("schnake valladares oscar pedro");
        ParticipanteModel participanteModelFound;
        ParticipanteEntity participanteEntity = new ParticipanteEntity();
        participanteEntity.setNombre("schnake valladares oscar pedro");

        when (localDataSource.obtenerPartcipante(rutSearched)).thenReturn (null);
        when (apiDataSource.obtenerPartcipante(rutSearched)).thenReturn (participanteEntity);

        //act
        participanteModelFound = repositoryParticipanteLocal.obtenerParticipante(rutSearched);

        // assert
        assertNotSame(participanteModelSearched, participanteModelFound);
    }

}

