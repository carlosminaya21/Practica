package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Notas;

public interface NotasRepository extends JpaRepository<Notas, Long>{

}
