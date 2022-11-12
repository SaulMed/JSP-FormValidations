package mx.spring.mvc.customValidations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TelefonoValidation implements ConstraintValidator<Telefono, String>{

	private String prefijoTelefono;//Obtener codigo por defecto "722"
	
	@Override
	public void initialize(Telefono telefono) {
		prefijoTelefono = telefono.value();
	}
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		boolean validacionMovil;
		//Si el no. que ingresa inicia con 722 regresa true sino false
		if(arg0 != null) validacionMovil = arg0.startsWith(prefijoTelefono);
		//En caso de que no coloque numero regresa falso
		else return validacionMovil = false;
		return validacionMovil;
	}

}
