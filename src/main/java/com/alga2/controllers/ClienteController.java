package com.alga2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alga2.dao.VendaRepository;
import com.alga2.persistence.Venda;

@RestController
@RequestMapping("/venda")
public class ClienteController {
	
	@Autowired
	private VendaRepository vendas;//aqui no video ele colocou Venda ao inves de VendaRepository
	
	@GetMapping("/all")
	public List<Venda> listar(){
		return vendas.findAll();
		
	}
	
}
