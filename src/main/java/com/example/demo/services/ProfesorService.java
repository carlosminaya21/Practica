package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.Profesor;

public interface ProfesorService {
	List<Profesor> listarProfesor();
	Profesor grabar(Profesor profesor);
	Profesor editar(Profesor profesor, Long id);
	void eliminar(Long id);

}
