package br.org.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/hello")
public class Controller {
	
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	
	@GetMapping("/bsm")
	public String bsm() {
		return "BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades \nBSM-GM - Mentalidade de Crescimento \n"
				+ "BSM-GM - Mentalidade de Crescimento \n BSM-PR - Responsabilidade Pessoal";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Nessa semana aprendemos a utilzar o workbench para criação de banco de dados, tabelas e DER.\n "
				+ "Também aprendemos a fazer o hello World utilizando SpringBoot";
	}

}
