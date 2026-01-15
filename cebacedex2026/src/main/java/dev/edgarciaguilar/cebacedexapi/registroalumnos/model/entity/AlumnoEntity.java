package dev.edgarciaguilar.cebacedexapi.registroalumnos.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import dev.edgarciaguilar.cebacedexapi.registroalumnos.model.dto.AlumnoDto.Sexo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("alumnos")
public class AlumnoEntity {
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
}
