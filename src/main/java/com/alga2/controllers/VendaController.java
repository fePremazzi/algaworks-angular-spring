package com.alga2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alga2.dao.ClienteRepository;
import com.alga2.persistence.Cliente;

@RestController
@RequestMapping("/cl")
public class VendaController {
	
	@Autowired
	private ClienteRepository clientes;
	
	@GetMapping("/all")
	public List<Cliente> listar(){
		return clientes.findAll();
	}
	
}
