package mx.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import mx.spring.mvc.customValidations.Telefono;

public class Alumno {

	@NotNull(message="Por favor llena este campo.")
	@Size(min = 3, message = "El nombre es obligatorio, minimo 3 letras.")
	@Pattern(regexp="\\D*$",message="Nombre invalido , numeros no aceptados.")
	private String nombre;
	
	@NotNull(message="Por favor llena este campo.")
	@Pattern(regexp="\\D*$",message="Apellido invalido , numeros no aceptados.")
	private String app;
	
	@Min(value=10, message="El alumno debe ser mayor a 10 años.")
	@Max(value=100, message="El alumno debe ser menor a los 100 años.")
	private Integer edad;
	
	@Email
	@NotNull(message="Por favor llena este campo.")
	private String email;
	
	@Telefono
	@Pattern(regexp ="\\d{10}", message="Se requieren 10 valores numericos.")
	private String telefono;
	
	@NotNull(message="Por favor llena este campo.")
	@Pattern(regexp ="\\d{5}", message="Solo se permiten 5 valores numericos.")
	private String codigoPostal;
	
	private String opcional;
	
	@NotNull
	private String titulacion;
	
	@NotNull
	private String idioma;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getOpcional() {
		return opcional;
	}

	public void setOpcional(String opcional) {
		this.opcional = opcional;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
