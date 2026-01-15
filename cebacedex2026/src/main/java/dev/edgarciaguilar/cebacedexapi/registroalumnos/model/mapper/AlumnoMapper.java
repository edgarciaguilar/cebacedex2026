package dev.edgarciaguilar.cebacedexapi.registroalumnos.model.mapper;

import org.mapstruct.Mapper;

import dev.edgarciaguilar.cebacedexapi.registroalumnos.model.dto.AlumnoDto;
import dev.edgarciaguilar.cebacedexapi.registroalumnos.model.entity.AlumnoEntity;

@Mapper(componentModel = "spring")
public interface AlumnoMapper {
	
	AlumnoEntity toEntity(AlumnoDto model);
	AlumnoDto toModel(AlumnoEntity entity);

}
