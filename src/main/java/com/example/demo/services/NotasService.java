package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.Notas;

public interface NotasService {
	List<Notas> listarNotas();
	Notas grabar(Notas notas);
	Notas editar(Notas notas, Long id);
	void eliminar(Long id);
	Notas asignarAlumno(Long idNot,Long idAlum);
	Notas asignarCurso(Long idNot, Long idCur);

}
