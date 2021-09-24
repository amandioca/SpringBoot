package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String atividades() {
		return "Atividade 1:\n"
				+ "Desenvolvi Mentaldade de Crescimento e a Adaptabilidade"
				+ "\n\nAtividade 2:\n"
				+ "Meu foco dessa semana, com certeza, foi a persistência. "
				+ "Continuar tentando em meio às dificuldas";
	}
}
