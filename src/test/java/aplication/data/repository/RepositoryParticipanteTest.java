package aplication.data.repository;

import aplication.domain.model.ParticipanteModel;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import aplication.data.datasource.DatasourceApi;
import aplication.data.datasource.DatasourceLocal;

@RunWith(MockitoJUnitRunner.class)
class RepositoryParticipanteTest {

    @Mock
    private DatasourceLocal localDataSource;

    @Mock
    private DatasourceApi apiDataSource;



    @InjectMocks
    private RepositoryParticipante repositoryParticipante = new RepositoryParticipante();

    @Test
    public void CuandoRutEstaEnLocalRecuperaDesdeLocal(){
        //arrange
        ParticipanteModel participanteModelEsperado = new ParticipanteModel();
        participanteModelEsperado.setRut("1-0");
        participanteModelEsperado.setNombre("SS");
        String rutparametro = "1-0";
        ParticipanteModel participanteModelRes;

        when(repositoryParticipante.obtenerParticipante(rutparametro)).thenReturn(participanteModelEsperado);


        //act

        participanteModelRes = repositoryParticipante.obtenerParticipante(rutparametro);

        //assert
        assertEquals(participanteModelEsperado, participanteModelRes);

    }

}