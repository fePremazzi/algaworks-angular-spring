package com.alga2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alga2.dao.ProdutoRepository;
import com.alga2.persistence.Produto;

@RestController
@RequestMapping("/pr")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtos;
	
	@GetMapping("/all")
	public List<Produto> listar(){
		return produtos.findAll();
	}
	
}
