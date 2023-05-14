package com.ecommerce.dante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.dante.entities.Produto;
import com.ecommerce.dante.services.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping 
	public ResponseEntity<List<Produto>> ListarTodos(){
		
		List<Produto>produtos = service.listarTodos();
		
		return ResponseEntity.ok().body(produtos);
		
	}
}
