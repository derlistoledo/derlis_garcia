package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class InicioController {

	
	@RequestMapping("/")
	public String index() {
		
		System.out.println("Cargando pagina de inicio");
		
		//pagina
		return "index";
	}
}
