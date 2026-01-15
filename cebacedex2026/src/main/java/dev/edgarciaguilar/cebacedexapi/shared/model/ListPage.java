package dev.edgarciaguilar.cebacedexapi.shared.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListPage<T> {

	private List<T> alumnos;
	private Long totalAlumnos;
	private Long totalPaginas;
	private Integer porPagina;
	private Integer pagina;
	
}
