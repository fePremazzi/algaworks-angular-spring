package com.alga2.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alga2.dao.VendaRepository;
import com.alga2.persistence.Venda;
import com.alga2.service.VendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendaController {
	
	@Autowired
	private VendaRepository vendas;
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping("/all")
	public List<Venda> listar(){
		return vendas.findAll();
	}
	
	@PostMapping("/add")
	public Venda adicionar(@RequestBody @Valid Venda venda) {
		return vendaService.adicionar(venda);
	}
	
}
