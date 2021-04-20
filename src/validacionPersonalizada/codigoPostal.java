//
package validacionPersonalizada;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class codigoPostal implements ConstraintValidator<validacionCodigoPostal, String>{
	
	//campo que almacena el valor por defecto que hemos declarado en la anotacion
	private String prefijoCodigoPostal;
	
	//En este metodo inicializamos el campo de clase creado con el valor por defecto de la anotacion
	@Override
    public void initialize(validacionCodigoPostal elCodigo) {
		prefijoCodigoPostal=elCodigo.value();
	}
	
	//Cuando el usuario valida el formulario dandole al boton de enviar, en el argumento arg0 se va a almacenar el codigo postal que haya introducido, y este codigo postal que estara almacenado en este parametro se va a comparar con prefijoCodigoPostal que tiene en su interior el numero 91 prefijado.
	//Este metodo debera devolver true si se cumple la validacion, o sea si el numero en arg0 comienza por 91 y false sino.
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		boolean validacion;		//por defecto las variables booleanas sin iniciar son false.
		
		//primero se testea si el usuario mete algo en el cuadro de texto a validar.
		if(arg0!=null){
			validacion=arg0.startsWith(prefijoCodigoPostal);
		}
		//Testear si ha dejado el campo vacio
		else{
			return validacion=false;			//aca dicendole false significa que si el usuario no conoce el codigo postal no podra avanzar.
		}
		return validacion;
	}

	

}
