package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello mundo!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação ao futuro, Responsabilidade Pessoal, Mentalidade de Crescimento, Persistência, Trabalho em equipe, Atenção aos detalhes, Proatividade, Comunicação!";
		}
	
	@GetMapping("/objetivos da semana")
	public String objetivosDaSemana() {
		return "Entender springboot";
	}

}
