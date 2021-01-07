package com.example.nalin.clienteFornecedor.services;

import org.springframework.stereotype.Service;

import com.example.nalin.clienteFornecedor.model.Produto;

@Service
public class ProdutoService {
	public void salvar(Produto produto)  {
		if(produto.nome==null || produto.nome=="") {
			throw new RuntimeException("nome obrigatório!");
		}
	}
}
