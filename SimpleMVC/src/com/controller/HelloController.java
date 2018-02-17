package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.UserData;

@Controller
public class HelloController {

	@RequestMapping(value="hello.html",method=RequestMethod.GET)
	public ModelAndView hello(@ModelAttribute("userData") UserData userData) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(userData);
		return modelAndView;
	}
	
	@RequestMapping(value="/admin/privatePage",method=RequestMethod.GET)
	public String privatePage() {
		return "privatePage";
	}
}
