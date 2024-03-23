package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
