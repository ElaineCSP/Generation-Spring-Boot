package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/objetivos")
public class Atividade2 {
	
	@GetMapping
		public String objetivos() {
		return "Objetivos de aprendizagem da semana: Desenvolver mais a atenção aos detalhes!";
	}
}





	