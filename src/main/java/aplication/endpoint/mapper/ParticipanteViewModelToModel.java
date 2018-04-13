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

    public static List<ParticipanteViewModel> reverse(List<ParticipanteModel> participanteModels) {
        List<ParticipanteViewModel> participanteViewModels = new ArrayList<>();
        for (ParticipanteModel participanteModel : participanteModels) {
            participanteViewModels.add(reverse(participanteModel));
        }
        return participanteViewModels;
    }

}
