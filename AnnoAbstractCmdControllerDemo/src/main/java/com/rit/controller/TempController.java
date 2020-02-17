package com.rit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Duplicate mapping demo
@Controller
public class TempController {
	
	@RequestMapping("/performsearch.htm111")
	public void process() {
		System.out.println("Method: process()");
		
	}
	
	 
	public String readBook() {
		
	}

}
