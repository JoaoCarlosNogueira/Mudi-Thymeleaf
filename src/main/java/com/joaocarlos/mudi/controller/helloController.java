package com.joaocarlos.mudi.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
	
	@GetMapping("/hello")
	public String helo(Model model) {
		model.addAttribute("nome", "teste");
		return "hello";
	}
}
