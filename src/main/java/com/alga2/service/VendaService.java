package com.alga2.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alga2.dao.ProdutoRepository;
import com.alga2.dao.VendaRepository;
import com.alga2.persistence.Venda;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendas;
	
	@Autowired
	private ProdutoRepository produtos;
	
	public Venda adicionar(Venda venda) {
		venda.setDataCadastro(LocalDateTime.now());
		venda.getItems().forEach(i -> {
			i.setVenda(venda);
			i.setProduto(produtos.findById(i.getProduto().getId()).get());
		});
		BigDecimal totalItems = venda.getItems().stream().map(i -> i.getProduto().getValor()
				.multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		venda.setTotal(totalItems.add(venda.getFrete()));
		
		return vendas.save(venda);
	}
	
	

}
