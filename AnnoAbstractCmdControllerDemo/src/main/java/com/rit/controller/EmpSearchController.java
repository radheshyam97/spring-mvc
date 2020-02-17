package com.rit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rit.command.EmpSearchCmd;
import com.rit.dto.EmployeeDTO;

@Controller
public class EmpSearchController {

	@RequestMapping("/performsearch.htm")
	public String search(ModelMap modelMap, @ModelAttribute EmpSearchCmd empSearchCmd) {

		System.out.println("Method: search(): empSearchCmd: " + empSearchCmd);

		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();

		EmployeeDTO e1 = new EmployeeDTO(101, 50000, "Ram", "SE");
		EmployeeDTO e2 = new EmployeeDTO(102, 60000, "Shyam", "Analyst");
		EmployeeDTO e3 = new EmployeeDTO(103, 70000, "Ramu", "Tester");
		EmployeeDTO e4 = new EmployeeDTO(104, 80000, "Mohan", "QA");
		EmployeeDTO e5 = new EmployeeDTO(105, 90000, "Rajiv", "Manager");
		EmployeeDTO e6 = new EmployeeDTO(106, 75000, "Kon", "Programmer");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		modelMap.addAttribute("searchResultList", list);
		return "emplist";

	}
}
