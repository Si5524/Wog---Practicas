package com.veterianria.veterinaria.infrastructure.Jpa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.veterianria.veterinaria.domain.model.DuenoModel;
import com.veterianria.veterinaria.infrastructure.DuenoEntity;

@Mapper
public interface DuenoMapper {

    DuenoMapper MAPPER = Mappers.getMapper(DuenoMapper.class);

    DuenoModel toModel(DuenoEntity duenoEntity);

    DuenoEntity toEntity(DuenoModel duenoModel);

    
}
