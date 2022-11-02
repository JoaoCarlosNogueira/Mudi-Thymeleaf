package com.joaocarlos.mudi.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
	
	@GetMapping("/hello")
	public String helo(HttpServletRequest request) {
		request.setAttribute("nome", "teste");
		return "hello";
	}
}
