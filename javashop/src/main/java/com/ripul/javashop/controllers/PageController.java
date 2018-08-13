package com.ripul.javashop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping( value = {"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title","Online Shop - Home");
		return mv;
	}
	
	@RequestMapping( value = "/about")
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("about");
		mv.addObject("title","Online Shop - About us");
		return mv;
	}
	
	@RequestMapping( value = "/contact")
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("contact");
		mv.addObject("title","Online Shop - Contact us");
		return mv;
	}
	
	@RequestMapping( value = "/products")
	public ModelAndView listProducts(){
		ModelAndView mv = new ModelAndView("products");
		mv.addObject("title","Online Shop - Products");
		return mv;
	}
}
