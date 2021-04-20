//Clase que modelara los estudiantes de una facultad de la universidad. Clase del bean
/*
ALGUNAS ANOTACIONES PARA VALIDACION UTILIZANDO LA LIBRERIA jakarta.validation.constraints
@NotNull validates that the annotated property value is not null.
@AssertTrue validates that the annotated property value is true.
@Size validates that the annotated property value has a size between the attributes min and max; can be applied to String, Collection, Map, and array properties.
@Min validates that the annotated property has a value no smaller than the value attribute.
@Max validates that the annotated property has a value no larger than the value attribute.
@Email validates that the annotated property is a valid email address.
Some annotations accept additional attributes, but the message attribute is common to all of them. This is the message that will usually be rendered when the value of the respective property fails validation.

And some additional annotations that can be found in the JSR:

@NotEmpty validates that the property is not null or empty; can be applied to String, Collection, Map or Array values.
@NotBlank can be applied only to text values and validates that the property is not null or whitespace.
@Positive and @PositiveOrZero apply to numeric values and validate that they are strictly positive, or positive including 0.
@Negative and @NegativeOrZero apply to numeric values and validate that they are strictly negative, or negative including 0.
@Past and @PastOrPresent validate that a date value is in the past or the past including the present; can be applied to date types including those added in Java 8.
@Future and @FutureOrPresent validate that a date value is in the future, or in the future including the present.
*/
package spring.mvcformtags.model;

import javax.validation.constraints.*;

import validacionPersonalizada.validacionCodigoPostal;

public class Alumnos {
																	
	@Size(min=2,max=20,message="Debe ingresar al menos dos caracteres")				//indicamos que tampoco puede ingresarse una cantidad de caracteres menores a 2 letras. Se incluye un mensaje que le saldrá al usuario en caso de no cumplir este criterio.
	@NotEmpty(message="nombre requerido")
	private String nombre;
	
	@Size(min=2,max=20,message="Debe ingresar al menos dos caracteres")
	@NotEmpty(message="apellido requerido")
	private String apellido;
	
	@Min(value=18, message="Debe ingresar un valor mayor o igual a 18")
	@Max(value=65, message="Debe ingresar un valor menor o igual a 65")
	private int edad;
	
	@NotNull(message="Debe elegir una opción")
	private String sexo;
	
	@NotNull(message="Debe elegir una opción")
	private String agno;
	
	@NotNull(message="Debe elegir una opción")
	private String carrera;
	
	@NotNull(message="Debe elegir una opción")
	private String asignaturaOptativa;
	
	@NotNull(message="Debe elegir al menos una opción")
	private String idioma;
	
	@Email(message="Ingresa un e-mail valido")
	@NotEmpty(message="e-mail requerido")
	private String email;
	
	@Pattern(regexp="[0-9]{9}",message="9 digitos exactos, sin letras")		//se establece un patron para el password, debera tener exactamente 3 caracteres, y estos podran ser de tres tipos, letras minusculas, mayusculas y numeros
	@NotEmpty(message="movil requerido")
	private String telMovil;
	
	@Min(value=8, message="No menos de 8 caracteres")
	@NotEmpty(message="Password requerido")
	private String password;
	
	@NotEmpty(message="Codigo Postal requerido")
	@validacionCodigoPostal						//validacion personalizada.
	private String codPostal;
	
	public Alumnos(){
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAgno() {
		return agno;
	}

	public void setAgno(String agno) {
		this.agno = agno;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getAsignaturaOptativa() {
		return asignaturaOptativa;
	}

	public void setAsignaturaOptativa(String asignaturaOptativa) {
		this.asignaturaOptativa = asignaturaOptativa;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelMovil() {
		return telMovil;
	}

	public void setTelMovil(String telMovil) {
		this.telMovil = telMovil;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	
}
