package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeController implements Controller {

	static {

		System.out.println("$$$$$$$$$$$$LOADED##############");
		

	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("Method: WelcomeController: handleRequest()");

		return new ModelAndView("welcome", "msg", "Welcome To Spring MVC");
	}
}
