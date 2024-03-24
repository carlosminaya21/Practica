package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.Curso;

public interface CursoService {
	List<Curso> listarCurso();
	Curso grabar(Curso curso);
	Curso Editar(Curso curso, Long id);
	void eliminar(Long id); 
	Curso asignarProfesor (Long idCur,Long idProfe);

}
