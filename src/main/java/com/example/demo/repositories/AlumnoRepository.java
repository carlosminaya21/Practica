package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
	Optional<Alumno> findByDni(String dni);
	Optional<Alumno> findByEmail(String email);
}
