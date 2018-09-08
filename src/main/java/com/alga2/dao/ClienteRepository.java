package com.alga2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alga2.persistence.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
