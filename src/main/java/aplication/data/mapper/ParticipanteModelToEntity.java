package aplication.data.mapper;

import aplication.data.entity.ParticipanteEntity;
import aplication.domain.model.ParticipanteModel;

public class ParticipanteModelToEntity {

    public static ParticipanteModel reverse(ParticipanteEntity participanteEntity) {
        ParticipanteModel participanteModel = new ParticipanteModel();
        participanteModel.setNombre(participanteEntity.getNombre());
        return participanteModel;
    }
}
