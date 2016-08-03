package com.juliano.submarine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.juliano.submarine.service.SubmarineService;

@Controller
public class SubmarineController {
	
	@Autowired
	SubmarineService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init(Model model)  {
		return "index";
	}

	@RequestMapping(value = "/calcMovements", method = RequestMethod.POST)
	public String calcMovements(Model model,@RequestParam("textInput") String text)  {
		
		String result = service.start(text);
		model.addAttribute("movement", result);
		
		return "result";
	}
	
	
}