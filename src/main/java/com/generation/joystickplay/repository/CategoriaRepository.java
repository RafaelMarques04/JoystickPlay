package com.generation.joystickplay.repository;

import com.generation.joystickplay.model.Categoria;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
	List<Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}