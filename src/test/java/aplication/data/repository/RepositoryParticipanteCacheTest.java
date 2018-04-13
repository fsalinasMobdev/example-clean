package aplication.data.repository;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepositoryParticipanteCacheTest {

        @Test(expected = IllegalArgumentException.class)
        public void deberiaDevolverExceptionCuandoElRutEsVacio(){
            ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
            String rut = "";
            validarRutUseCase.validar(rut);
        }

}