package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
// Anotação responsável para definir como uma classe controladora, que vai ler as requisições.

@RequestMapping("/bsm") 
// Anotação onde damos um endereço para acessar, como se fosse o caminho do navegador do google.


public class BSM {
	
	@GetMapping
	public String bsm() {
		return "\r\nLista de BSM's da Generation Brasil: \r\n"
				+ "\r\n- Responsabilidade pessoal, "
				+ "\r\n- Mentalidade de crescimento, "
				+ "\r\n- Orientação ao futuro, "
				+ "\r\n- Persistência, "
				+ "\r\n- Comunicação, "
				+ "\r\n- Trabalho em equipe, "
				+ "\r\n- Proatividade, "
				+ "\r\n- Orientação ao detalhe.";	
	}
}