package mx.spring.mvc;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/inicio")
public class InicioController {

	//Llamar UNICAMENTE a la vista requerida
	@RequestMapping("/reqForm")	//Indicar a Spring la busqueda de este fomulario por URL
	public String reqForm() {
		return "peticionFormulario";
	}
	
	//Llamar UNICAMENTE a la vista requerida
	@RequestMapping("/resForm")
	public String resForm() {
		return "respuestaFormulario";
	}
	
	//Procesar data del Model y despues llamar a la vista requerida
	@RequestMapping("/resModelForm")
	//public String resModelForm(HttpServletRequest request, Model model) {
	public String resModelForm(@RequestParam("studentName") String nombre, Model model) {
		//Capturar data del Input
		//String nombre = request.getParameter("studentName");
		
		//Manipulacion de data
		String msjFinal = "¿Qué esta sucediendo? " + " <strong>" + nombre + "</strong>";
		msjFinal = msjFinal.concat(" esta aprendiendo Spring.");
		
		//Agregando data al Model
		model.addAttribute("respuestaModelo",msjFinal);
		return "respuestaFormulario";
	}
	
}
