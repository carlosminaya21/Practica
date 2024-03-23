package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long>{
	Optional<Profesor> findByDni(String dni);
	Optional<Profesor> findByEmail(String email);
}
