package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	
	@RequestMapping({"/","/home"})
	public String home() {
		System.out.println("hello buddy crazy work!! ");
		return "index";
	}
}
