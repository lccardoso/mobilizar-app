package com.example.mobilizar.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobilizar.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
