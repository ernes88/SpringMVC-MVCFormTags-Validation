package spring.mvcformtags.model;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
public class ControladorAlumnos {
	
	@RequestMapping									//anotacion que le indica a eclipse cual es el controlador principal.
	public String muestraPagina(){
		return "paginaBienvenida";
	}
		
	//Metodo que se encarga de resolver el problema de los espacios en blanco en los campos de texto para validacion al inicio de los mismos, cuando no se introduce texto
	@InitBinder
	public void binderMethod (WebDataBinder binder){
		
		StringTrimmerEditor trimmer=new StringTrimmerEditor(true);			//true como argumento para que tome como null los espacios en blanco
		
		binder.registerCustomEditor(String.class, trimmer);
	}
	

	//Este metodo llamara al formulario de registro, lo que se introduzca en el mismo se guardara en un objeto de tipo alumnos, para despues mandarselo a la vista de confirmacion de registro.
	//Mediante la utilizacion del objeto de tipo Model, podemos pasar el objeto Alumno entre las paginas JSP.
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo){
		
		//Crear un objeto de la clase Alumnos
		Alumnos alumno=new Alumnos();
		
		//Proveerle de este objeto de la clase Alumnos al modelo
		modelo.addAttribute("alumnos", alumno);					//aca se hace el mapeo entre el objeto alumno de la clase Alumnos y la propiedad "alumnos" del formulario generaFormulario. O sea el Model modelo es como un puente entre estos dos bloques, grabandose en alumno la info introducida en el formulario una vez se llama al formulario cuando retorna el metodo
		
		return "generaFormulario";	
	}
	
	//Metodo invocado cuando el usuario pincha en el boton de enviar del formulario, o sea es el que procesa la info introducida en los campos del formulario, y es aqui donde debemos especificar la validacion de los campos.
	//Le decimos al metodo que vamos a usar validacion con @Valid, y que los resultados de la misma ya sean positivos o negativos se guardaran en un objeto de tipo BindingResult, y eso se hace agregando un nuevo argumento de este tipo al metodo.
	//OJO MUY IMPORTANTE:A PESAR DE QUE ES POSIBLE EN EL @MODELATTRIBUTE DE ARGUMENTO PASAR UNA STRING CUALQUIERA Y USAR ESTA EN LA PAGINA CONFIRMACIONREGISTRO PARA CON JSPTAGS ADQUIRIR LOS DATOS, ESTO CAUSA UN ERROR EN EL PROCESO DE VALIDACION. PONER ALUMNOS COMO SE DEFINIO EN modelo.addAttribute("alumnos", alumno);	EN EL METODO muestraFormulario()
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("alumnos") Alumnos alumno, BindingResult resultadoValidacion){		//Al ejecutar este metodo se mapea el contenido de alumno a la propiedad "alumnos", que sera la utilizada en la pagina jsp confirmacionRegistro
		
		//Como se va a usar validacion, si lo que introduce el usuario es correcto el metodo no debe devolver confirmacionRegistro, sino que debe mandar el flujo del programa de nuevo a la pagina que genera el formulario o sea a generaFormulario, donde le saldran al usuario los mensajes de error establecidos en la clase alumno en las anotaciones @Size y @NotNull
		if(resultadoValidacion.hasErrors())
			return "generaFormulario";			//si lo introducido tiene errores de acuerdo a lo que estamos validando mando el flujo a la pagina de registro
		else{
			return "confirmacionRegistro";		//si no tiene errores voy a la pagina de confirmacion
		}
			
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
