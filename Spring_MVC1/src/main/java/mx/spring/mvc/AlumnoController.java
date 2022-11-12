package mx.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("alumno")
public class AlumnoController {
	
	@InitBinder
	public void noSpaces(WebDataBinder binder) {
		StringTrimmerEditor trim = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trim);
	}

	@RequestMapping("showForm")
	public String showForm(Model model) {
		Alumno alumno = new Alumno();
		model.addAttribute("student", alumno);
		return "registroAlumno";
	}

	@RequestMapping("processForm")
	//Usando validacion en este metodo
	public String processForm(@Valid @ModelAttribute("student") Alumno estudiante, BindingResult validacion) {
//		System.out.println(estudiante.getNombre());
		if(validacion.hasErrors()) {	//Si hay errores regresar al formulario si no avanzar con el flujo normal
			return "registroAlumno";
		}else {			
			return "confirmarAlumno";
		}
	}

}
