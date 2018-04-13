package aplication.endpoint;

import aplication.data.exceptions.NoResultApiExceptions;
import aplication.domain.model.ParticipanteModel;
import aplication.domain.usecase.ObtenerParticipanteUseCases;
import aplication.endpoint.mapper.ParticipanteViewModelToModel;
import aplication.endpoint.modelview.ParticipanteViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParticipanteEndpoint {

    @Autowired
    private ObtenerParticipanteUseCases obtenerParticipanteUseCases;

    @RequestMapping(value = "/participante", method = RequestMethod.GET)
    public ParticipanteViewModel obtenerParticipante(@RequestParam(value = "rut") String rut) throws NoResultApiExceptions {
        return ParticipanteViewModelToModel.reverse(obtenerParticipanteUseCases.obtenerParticipante(rut));
    }

    @RequestMapping(value = "/allParticipantesLocal", method = RequestMethod.GET)
    public List<ParticipanteViewModel> obtenerAllParticipantesLocales() {
        List<ParticipanteViewModel> listadoViewModel = new ArrayList<>();
        List<ParticipanteModel> listadoModel = obtenerParticipanteUseCases.obtenerAllParticipanates();
        for(ParticipanteModel model : listadoModel){
            listadoViewModel.add(ParticipanteViewModelToModel.reverse(model));
        }
        return listadoViewModel;
    }

}
