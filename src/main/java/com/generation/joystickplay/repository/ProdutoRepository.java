package com.generation.joystickplay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.joystickplay.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}