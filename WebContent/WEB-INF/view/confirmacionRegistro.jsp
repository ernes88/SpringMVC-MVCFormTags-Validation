<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmacion de registro</title>
</head>

<body>
	<h3>Usted se ha registrado satisfactoriamente y sus datos son:</h3>
		
		<!-- En la pagina de confirmacion se usan las etiquetas JSP -->
		Nombre: <strong>${alumnos.nombre}</strong>				<!-- Aca se usa en la JSP Tag el nombre de la propiedad que se definio en la anotacion @ModelAttribute, o sea "alumnos", que contiene la informacion del objeto alumno, que contiene la informacion que se introdujo en los campos de texto del formulario -->
        <br>
        
        Apellidos: <strong>${alumnos.apellido}</strong>			<!-- La JSP Tag dentro de una etiqueta <strong> pone el contenido en negrita -->
        <br>
        
        Edad: <strong>${alumnos.edad}</strong>
        <br>
           
        Genero: <strong>${alumnos.sexo}</strong>
        <br>
        
        Año en curso: <strong>${alumnos.agno}</strong>
        <br>
        
        Carrera: <strong>${alumnos.carrera}</strong>
        <br>
        
        Asignatura Optativa: <strong>${alumnos.asignaturaOptativa}</strong>
        <br>
        
        Idioma: <strong>${alumnos.idioma}</strong>
        <br>
        
        e-mail: <strong>${alumnos.email}</strong>
        <br>
        
        Teléfono Movil: <strong>${alumnos.telMovil}</strong>
        <br>
        
        Código Postal: <strong>${alumnos.codPostal}</strong>
        <br>
        
        Password: <strong>${alumnos.password}</strong>
        <br>
        
</body>

</html>