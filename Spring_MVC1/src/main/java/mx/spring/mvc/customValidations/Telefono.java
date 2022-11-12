package mx.spring.mvc.customValidations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=TelefonoValidation.class)	//Clase encargada de llevar acabo la validacion
@Target({ElementType.METHOD, ElementType.FIELD})	//Metodos y campos seran aplicables para esta validacion
@Retention(RetentionPolicy.RUNTIME)	//El chequeo de esta validacion se aplica en tiempo de ejecucion
public @interface Telefono {
	public String value() default "722"; //Iniciacion del Numero de Telefono
	public String message() default "El numero, siempre debe iniciar por:  722";//Mensaje de Error
	Class<?>[] groups() default {};//Definicion de Grupos
	Class<? extends Payload>[] payload() default {};//Definicion de Payloads
}
