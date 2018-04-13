package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.domain.model.ParticipanteModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class ObtenerParticipanteUseCasesTest {

    @Mock
    private Repository repository;

    @InjectMocks
    private ObtenerParticipanteUseCases obtenerParticipanteUseCases  = new ObtenerParticipanteUseCases();

    @Test
    public void DeberiaDevolverParticipanteModelConNombreCorrectoCuandoSePasaRutValido(){
        //arrange
        ParticipanteModel participanteModelEsperado = new ParticipanteModel();
        ParticipanteModel participanteModelResp;
        String rutValido = "14354986-0";
        participanteModelEsperado.setNombre("sanchez reyes sergio alejandro");

        when(repository.obtenerParticipante(rutValido)).thenReturn(participanteModelEsperado);

        //act

        participanteModelResp = obtenerParticipanteUseCases.obtenerParticipante(rutValido);

        //assert

        assertEquals(participanteModelEsperado, participanteModelResp);
    }


    @Test
    public void DeberiaDevolverParticipanteModelConControlSalidaCuandoSePasaRutNoValido(){
        //arrange
        ParticipanteModel participanteModelEsperado = new ParticipanteModel();
        ParticipanteModel participanteModelResp;
        String rutNoValido = "14a54986-0";

        participanteModelEsperado.setNombre("Rut Invalido");

        when(repository.obtenerParticipante(rutNoValido)).thenReturn(participanteModelEsperado);

        //act

        participanteModelResp = obtenerParticipanteUseCases.obtenerParticipante(rutNoValido);

        //assert

        assertEquals(participanteModelEsperado, participanteModelResp);
    }


}