package com.example.mobilizar.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobilizar.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}