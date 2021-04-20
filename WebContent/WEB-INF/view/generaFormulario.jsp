<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  	<!-- librerias a incluir para poder trabajar con las MVC Form Tags -->
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Registro de Alumnos</title>
	</head>
	
	<h3>Formulario de Registro de alumnos</h3>
	
	<body>	
			<!-- Aca usaremos las MVC Form Tags para cosntruir este formulario de registro. -->
			<!-- Cuando este formulario se carga, la MVC Tag llama al metodo getter de la clase Alumno y cuando pulsamos enviar llaman a los setter de la clase alumno  -->
		<form:form action="procesarFormulario" modelAttribute="alumnos">  		<!-- tiene que coincidir el modelAttribute con la propiedad definida para el objeto de tipo Model definida en ControladorAlumno en el metodo addAttribute, o sea "alumnos", de esta forma se podra mapear los valores introducidos aca hacia el objeto modelo de tipo Alumnos. Mapea todo hacia el metodo anotado con la anotacion confirmacionRegistro. -->        	
        	Nombre(*): 
        	<br>
        	<form:input path="nombre" />         
        	<form:errors path="nombre" style="color:red"></form:errors>
        	<br><br>  
        	
        	Apellidos(*): 
        	<br>
        	<form:input path="apellido" />  									<!-- Este path hace referencia a los getters y setters de la clase Alumnos, por tanto no podemos poner cualquier valor en path. -->
        	<form:errors path="apellido" style="color:red"></form:errors>
        	<br><br>
        	
        	Edad(*):
        	<br>
        	<form:input path="edad" />  										<!-- Este path hace referencia a los getters y setters de la clase Alumnos, por tanto no podemos poner cualquier valor en path. -->
        	<form:errors path="edad" style="color:red"></form:errors>
        	<br><br>
        	  	
        	Genero(*):
        	<br>          
        	Masculino<form:radiobutton path="sexo" value="Masculino"/>  
        	Femenino<form:radiobutton path="sexo" value="Femenino"/> 
        	<form:errors path="sexo" style="color:red"></form:errors>
        	<br><br>
        	
        	Año en curso(*):
        	<br> 
        	1<form:radiobutton path="agno" value="1"/>  
        	2<form:radiobutton path="agno" value="2"/>
        	3<form:radiobutton path="agno" value="3"/>  
        	4<form:radiobutton path="agno" value="4"/>
        	5<form:radiobutton path="agno" value="5"/>
        	<form:errors path="agno" style="color:red"></form:errors>  
        	<br><br>
        	
       		Carrera(*): 
       		<br>
       		Ingenieria de Software<form:radiobutton path="carrera" value="Ingenieria de Software"/>  <br>
        	Ingenieria en Sistemas<form:radiobutton path="carrera" value="Ingenieria en Sistemas"/>  <br>
        	Arquitectura de Software<form:radiobutton path="carrera" value="Arquitectura de Software"/>  <br>
       		Programacion<form:radiobutton path="carrera" value="Programacion"/> 
       		<form:errors path="carrera" style="color:red"></form:errors> 
        	<br><br>
        	
        	Asignatura Optativa(*): 
        	<br>
        	<form:select path="asignaturaOptativa">  
        		<form:option value="Matematica" label="Matematica"/>  
        		<form:option value="Programacion en Java" label="Programacion en Java"/>  
        		<form:option value="Sistemas Operativos" label="Sistemas Operativos"/>  
        		<form:option value="Framework Spring" label="Framework Spring"/>
        		<form:errors path="asignaturaOptativa" style="color:red"></form:errors>  
        	</form:select>
        	<br><br>
        	
        	Idioma(*):
        	<br>
        	Francés<form:checkbox path="idioma" value="Francés"/>  <br>
        	Inglés<form:checkbox path="idioma" value="Inglés"/>  <br>
        	Español<form:checkbox path="idioma" value="Español"/>  <br>
       		Alemán<form:checkbox path="idioma" value="Alemán"/>
       		<form:errors path="idioma" style="color:red"></form:errors>   
        	<br><br>
        	
        	e-mail(*):
        	<br>
        	<form:input path="email" />         
        	<form:errors path="email" style="color:red"></form:errors>
        	<br><br>
        	
        	Teléfono Movil(*):
        	<br>
        	<form:input path="telMovil" />         
        	<form:errors path="telMovil" style="color:red"></form:errors>
        	<br><br>
        	
        	Codigo Postal(*):
        	<br>
        	<form:input path="codPostal" />         
        	<form:errors path="codPostal" style="color:red"></form:errors>
        	<br><br>
        		
        	Password(*):
        	<br>
        	<form:input path="password" />         
        	<form:errors path="password" style="color:red"></form:errors>
        	<br><br>
        	
        	<input type="submit" value="Enviar" /> 
        	
        	<br><br> 
        	     
    	</form:form>
			
	</body>
</html>