package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/objetivos") 

public class Objetivos {
	
	@GetMapping
	public String objetivos() {
		return "\r\nObjetivos de aprendizagem desta semana:\r\n"
				+ "\r\n - Banco de dados com MySQL:"
				+ "\r\nIntrodução a Banco de Dados com MySQL,"
				+ "\r\nBanco de Dados com MySQL - parte 01,"
				+ "\r\nBanco de Dados com MySQL - parte 02,"
				+ "\r\nDiagrama Entidade Relacionamento (DER) no MySQL Workbench.\r\n"
				+ "\r\n- Introdução ao Protocolo HTTP.\r\n"
				+ "\r\n- Backend - Spring:"
				+ "\r\nIntrodução ao Spring,"
				+ "\r\nPrimeiros passos com Spring BOOT,"
				+ "\r\nIntrodução ao JPA.";
	}

}
