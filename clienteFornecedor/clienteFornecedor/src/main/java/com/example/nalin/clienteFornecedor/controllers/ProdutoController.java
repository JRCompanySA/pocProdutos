package com.example.nalin.clienteFornecedor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nalin.clienteFornecedor.model.Produto;
import com.example.nalin.clienteFornecedor.services.ProdutoService;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable String id) {
		return new Produto(id);
	}
	
	@PostMapping
	public String postProduto(@RequestBody Produto produto){
		service.salvar(produto);
		return "salvo com sucesso!";
	}
}
