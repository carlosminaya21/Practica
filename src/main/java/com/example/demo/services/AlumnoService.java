package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.Alumno;

public interface AlumnoService {
	List<Alumno> listarAlumno();
	Alumno grabar(Alumno alumno);
	Alumno editar(Alumno alumno, Long id);
	void eliminar(Long id);
	
	

}
