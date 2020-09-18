package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.model.Tienda;
import py.edu.facitec.repository.TiendaRepository;

@Controller
public class TiendaController {

	//INYECCION DE DEPENDENCIA
	@Autowired//            minuscula
	private TiendaRepository tiendaRepository;
	
	@RequestMapping ("/form_tienda")
	public String metodo() {
		
		return "view/tienda/form";
	}
	
	
	@RequestMapping(value ="/registrar_tienda", method= RequestMethod.POST)
	
	//NOMBRE Y CORREO
	//recibe los datos del formulario 
	public ModelAndView registrar (Tienda tienda) {
	
		
		//registrar Tienda
		tiendaRepository.save(tienda);
		
		System.out.println("Registrado con exito: "+tienda);
		
		return new ModelAndView("redirect:form_tienda");
	}
	
	
	
}
