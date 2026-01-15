package dev.edgarciaguilar.cebacedexapi.registroalumnos.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlumnoDto {
	private String id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String telefonoCasa;
	private String telefonoCelular;
	private String ocupacion;
	private String direccion;
	private String padecimientos;
	private String tipoSangre;
	private String correoElectronico;
	private String nombreResponsable;
	private String telefonoResponsable;
	private Sexo sexo;
	
	public enum Sexo {
		M,
		F
	}
}
