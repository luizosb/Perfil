package com.perfil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/perfil")
public class PerfilController {
	
	@RequestMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("Perfil");
		return mv;
	}
	
	@RequestMapping("/projetos")
	public ModelAndView projetos() {
		ModelAndView mv = new ModelAndView("Projetos");
		return mv;
	}
	
	@RequestMapping("/skills")
	public ModelAndView skills() {
		ModelAndView mv = new ModelAndView("Skills");
		return mv;
	}
	
	@RequestMapping("/contatos")
	public ModelAndView contatos() {
		ModelAndView mv = new ModelAndView("Contatos");
		return mv;
	}
}
