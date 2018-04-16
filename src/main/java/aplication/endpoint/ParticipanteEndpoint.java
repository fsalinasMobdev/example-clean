package aplication.endpoint;

import aplication.domain.usecase.ObtenerParticipanteUseCases;
import aplication.endpoint.mapper.ParticipanteViewModelToModel;
import aplication.endpoint.modelview.ParticipanteViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParticipanteEndpoint {

    @Autowired
    private ObtenerParticipanteUseCases obtenerParticipanteUseCases;

    @RequestMapping(value = "/participante", method = RequestMethod.GET)
    public ParticipanteViewModel obtenerParticipante(@RequestParam(value = "rut") String rut) {
        return ParticipanteViewModelToModel.reverse(obtenerParticipanteUseCases.obtenerParticipante(rut));
    }

    @RequestMapping(value = "/participantes",method = RequestMethod.GET)
    public List<ParticipanteViewModel> obtenerParticipantes(){
        return ParticipanteViewModelToModel.reverseLista(obtenerParticipanteUseCases.listarParticipantes());
    }

}
