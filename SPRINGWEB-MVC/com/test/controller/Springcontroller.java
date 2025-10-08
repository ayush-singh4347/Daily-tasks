package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Springcontroller {
	public ModelAndView openHelloPage() {
		System.out.println("openHelloPage() method is executed");
		
		ModelAndView mav=new ModelAnd View();
		mav.setViewName("hello");
		
		return mav;
	}
}
