package aplication.data.mapper;

import aplication.data.entity.ParticipanteEntity;
import aplication.domain.model.ParticipanteModel;

import java.util.ArrayList;
import java.util.List;

public class ParticipanteModelToEntity {

    public static ParticipanteModel reverse(ParticipanteEntity participanteEntity) {
        ParticipanteModel participanteModel = new ParticipanteModel();
        participanteModel.setNombre(participanteEntity.getNombre());
        return participanteModel;
    }


    public static List<ParticipanteModel> reverse(List<ParticipanteEntity> particitantesEntity) {
        List<ParticipanteModel> participanteModels = new ArrayList<>();
        for (ParticipanteEntity particitanteEntity : particitantesEntity) {
            participanteModels.add(reverse(particitanteEntity));
        }
        return participanteModels;
    }
}
