package com.rit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.rit.dao.UserDAO;
import com.rit.vo.UserDetails;

public class RegistrationController extends AbstractWizardFormController{

	private UserDAO userDAO;;
	
	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		UserDetails userDetails=(UserDetails) command;
		
	 boolean createFlag=userDAO.create(userDetails);
	 if(createFlag)
		 return new ModelAndView("RegistrationSuccess.jsp");
	 return new ModelAndView("RegistrationFail.jsp");
		
  	}

 

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
