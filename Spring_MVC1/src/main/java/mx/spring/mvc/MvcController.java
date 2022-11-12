package mx.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	
	//Especificar que vista se requiere
	@RequestMapping
	public String showPage() {
		return "index";
	}
	
}
