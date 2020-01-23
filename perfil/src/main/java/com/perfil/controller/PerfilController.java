package com.perfil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerfilController {
	
	@RequestMapping("/perfil")
	public String novo() {
		return "Perfil";
	}
	
}
