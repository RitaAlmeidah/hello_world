package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
// anotação responsável para definir como uma classe controladora, que vai ler as requisições.

@RequestMapping("/hello-world") 
// damos um endereço para acessar, como se fosse o camnho do navegador do google


public class HelloWorldController {

	@GetMapping
	//criar o método com as requisições, qual o tipo de requisição, neste caso usa-se o GetMapping, 
	// para tranformar o método normal em metodo de requisição(Get para buscar as informações):
	
	public String hellowrld() {
		return "Hello World!";
	}
	
}
