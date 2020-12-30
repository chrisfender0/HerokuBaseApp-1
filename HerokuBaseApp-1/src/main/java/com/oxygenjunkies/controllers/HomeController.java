package com.oxygenjunkies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value={"", "/", "home"})
	public ModelAndView goHome(ModelAndView mv) {
		mv.setViewName("Homepage");
		return mv;
	}
	
	@RequestMapping(value={"portfolio"})
	public ModelAndView goPortfolio(ModelAndView mv) {
		mv.setViewName("Portfolio");
		return mv;
	}
	
}
