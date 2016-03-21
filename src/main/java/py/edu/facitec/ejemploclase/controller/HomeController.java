package py.edu.facitec.ejemploclase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(){
		System.out.println("Bienvenido a la página");
		return "hello-world";
	}
	
}
