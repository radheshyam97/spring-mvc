package com.rit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.rit.model.LoginModel;
import com.rit.model.UserDetails;

public class LoginController extends AbstractCommandController {

	private LoginModel loginModel;

	@Override
	protected ModelAndView handle(HttpServletRequest arg0, HttpServletResponse arg1, Object command,
			BindException bindException) throws Exception {

		 
		UserDetails userDetails = (UserDetails) command;
		
		System.out.println("userDetails: " + userDetails);

		String type = loginModel.validate(userDetails);
		if (type == null)
			return new ModelAndView("/Login.html");

		if (type.equalsIgnoreCase("admin"))
			return new ModelAndView("/AdminHome.jps");
		else
			return new ModelAndView("/UserHome.jps");

	}

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;

	}

}
