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

    public static List<ParticipanteModel> reverseAll(List<ParticipanteEntity> particitanteEntities) {
        List<ParticipanteModel> participantesModel = new ArrayList<>();
        for (ParticipanteEntity particitanteEntity :particitanteEntities){
            ParticipanteModel participanteModel = new ParticipanteModel();
            participanteModel.setNombre(particitanteEntity.getNombre());
            participantesModel.add(participanteModel);
        }
        return participantesModel;
    }

}
