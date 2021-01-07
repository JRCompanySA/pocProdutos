package com.example.nalin.clienteConsumidor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

	
	@RestController
	public class MainController {
		@GetMapping("/")
		public String getMain() {
			return "main Consumidor";
		}
		
	}


