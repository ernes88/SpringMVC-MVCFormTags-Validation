package validacionPersonalizada;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=codigoPostal.class)				//Futura clase que contendra la logica de la validacion
@Target( { ElementType.METHOD, ElementType.FIELD })			//Tipos de componentes Java a los cuales se les va a aplicar la validacion
@Retention(RetentionPolicy.RUNTIME)							//La validacion se va a ejecutar en tiempo de ejecucion, que es cuando el usuario introduce valores.
public @interface validacionCodigoPostal {

	//definir el codigo postal por defecto
	public String value() default "91";	
	
	//definir el mensaje de error que lanzara la pagina en caso de error
	public String message="El codigo postal debe comenzar por 91";
	
	//definir los grupos
	Class<?>[] groups() default {};							//Los grupos se usan para hacer validaciones por grupos, de modo que cuando rellenemos un grupo de campos, si hay error no hay que esperar a que el usuario puklse enviar, sino que ya cuando salte a otro campo fuera del grupo ya le lanzara el error si entro mal los datos.
	
	//definir los payloads
	Class<? extends Payload>[] payload() default {};		//se usan para contener los datos que pueden ser almacenados o actualizados, se usan mucho para metadatos
	
	
}
