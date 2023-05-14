package com.ecommerce.dante.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dante.entities.Produto;
import com.ecommerce.dante.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public  List<Produto> listarTodos(){
		List <Produto> produtos = repository.findAll();
		return produtos;
		
	}

}
