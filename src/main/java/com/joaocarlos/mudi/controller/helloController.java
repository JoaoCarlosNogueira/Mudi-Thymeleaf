package com.joaocarlos.mudi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.joaocarlos.mudi.model.Pedido;
import com.joaocarlos.mudi.repository.PedidoRepository;

@Controller
public class helloController {
	
	@Autowired
	private PedidoRepository repository;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Pedido> pedidos = repository.findAll();
		model.addAttribute("pedidos", pedidos);
		return "home"; 
	}
}
