package br.edu.atitus.javanaveia.projetoestoque.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {
	@GetMapping("/status")
	public String getStatus() {
		return "Hello World";
	}
}
