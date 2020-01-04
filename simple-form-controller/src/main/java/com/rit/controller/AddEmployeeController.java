package com.rit.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.rit.vo.EmployeeDetails;

public class AddEmployeeController extends SimpleFormController {

	private com.rit.service.EmployeeService employeeService;

	@Override
	protected void doSubmitAction(Object command) throws Exception {
		
		EmployeeDetails empDetails=(EmployeeDetails) command;
		employeeService.add(empDetails);
	}

	public void setEmployeeService(com.rit.service.EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

}