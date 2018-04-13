package aplication.endpoint.mapper;

import aplication.domain.model.ParticipanteModel;
import aplication.endpoint.modelview.ParticipanteViewModel;

import java.util.ArrayList;
import java.util.List;

public class  ParticipanteViewModelToModel {


    public static ParticipanteViewModel reverse(ParticipanteModel particitanteModel) {
        ParticipanteViewModel participanteViewModel = new ParticipanteViewModel();
        participanteViewModel.setNombre(particitanteModel.getNombre());
        return participanteViewModel;
    }

    public static List<ParticipanteViewModel> reverseAll(List<ParticipanteModel> particitantesModel) {
        List<ParticipanteViewModel> participantesViewModel = new ArrayList<>();
        for (ParticipanteModel particitanteModel :particitantesModel){
            ParticipanteViewModel participanteViewModel = new ParticipanteViewModel();
            participanteViewModel.setNombre(particitanteModel.getNombre());
            participantesViewModel.add(participanteViewModel);
        }
        return participantesViewModel;
    }

}
