package com.kce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kce.model.form;

@Controller
public class Controller_c {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView doStart()
	
	{
		return new ModelAndView("form");
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView doAdd(@ModelAttribute form form)
	{
		if(((form.getUsername()).equals("admin"))&&((form.getPassword()).equals("admin")))
		{
			return new ModelAndView("success");
		}
		return new ModelAndView("tryagain");
		
	}

}
