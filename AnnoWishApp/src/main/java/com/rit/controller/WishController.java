package com.rit.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rit.service.WishService;

@Controller
public class WishController {
	@Resource
	WishService service;

	@RequestMapping("/wish.htm")
	public ModelAndView process() {
		System.out.println("Method: In process()");
		String msg = service.generateWishMsg();
		return new ModelAndView("result", "wmsg", msg);
	}
}
