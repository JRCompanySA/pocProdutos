package com.example.nalin.clienteConsumidor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.nalin.clienteConsumidor.model.Produto;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	@Autowired
	RestTemplate restTemplate;
	
		
//	@GetMapping("/{id}")
//	public Produto getProduto(@PathVariable String id) {
//		return new Produto(id);
//	}
	
	@PostMapping
	public String postProduto(@RequestBody Produto produto){
		HttpEntity<Produto> produtoEnviado  = new HttpEntity<Produto>(produto);
		HttpHeaders headers = new HttpHeaders();
		return restTemplate.exchange("http://localhost:8081/produtos", HttpMethod.POST, produtoEnviado, String.class).getBody();
	}
}
