package com.alga2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alga2.persistence.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
