package com.rit.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.rit.models.LoginModel;

/**
 * @author radheshyamc
 * 
 */
public class LoginControler implements Controller {

	private LoginModel loginModel;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String userName = request.getParameter("uname");
		String userPass = request.getParameter("pass");
		String type = loginModel.validate(userName, userPass);
		if (type == null)
			return new ModelAndView("/Login.html");
		else if (type.equalsIgnoreCase("admin"))
			return new ModelAndView("/AdminHome.jsp");
		else
			return new ModelAndView("/UserHome.jsp");

	}

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

}
