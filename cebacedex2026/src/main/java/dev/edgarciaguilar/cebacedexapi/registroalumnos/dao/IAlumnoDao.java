package dev.edgarciaguilar.cebacedexapi.registroalumnos.dao;

import java.util.List;

import dev.edgarciaguilar.cebacedexapi.registroalumnos.model.dto.AlumnoDto;
import dev.edgarciaguilar.cebacedexapi.shared.model.ListPage;

public interface IAlumnoDao {
	
	void create(AlumnoDto alumno);
	void update(AlumnoDto alumno);
	void delete(String id);
	AlumnoDto getById(String id);
	List<AlumnoDto> listAll = null;
	ListPage<AlumnoDto> search(String searchText, Integer page, Integer perPage);
	
	
	 
	

}
