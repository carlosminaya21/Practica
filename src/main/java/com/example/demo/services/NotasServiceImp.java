package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Alumno;
import com.example.demo.domain.Curso;
import com.example.demo.domain.Notas;
import com.example.demo.repositories.AlumnoRepository;
import com.example.demo.repositories.CursoRepository;
import com.example.demo.repositories.NotasRepository;

import jakarta.transaction.Transactional;

@Service
public class NotasServiceImp implements NotasService {

	@Autowired
	private NotasRepository notRep;
	@Autowired
	private AlumnoRepository alumRep;
	@Autowired
	private CursoRepository curRep;
	
	@Override
	@Transactional
	public List<Notas> listarNotas() {
		// TODO Auto-generated method stub
		return notRep.findAll();
	}

	@Override
	@Transactional
	public Notas grabar(Notas notas) {
		// TODO Auto-generated method stub
		return notRep.save(notas);
	}

	@Override
	@Transactional
	public Notas editar(Notas notas, Long id) {
		notas.setIdNota(id);
		return notRep.save(notas);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		notRep.deleteById(id);

	}

	@Override
	@Transactional
	public Notas asignarAlumno(Long idNot, Long idAlum) {
		Notas notas = notRep.findById(idNot).orElseThrow(null);
		Alumno alumno = alumRep.findById(idAlum).orElseThrow(null);
		notas.setAlumno(alumno);
		return notRep.save(notas);
	}

	@Override
	@Transactional
	public Notas asignarCurso(Long idNot, Long idCur) {
		Notas notas = notRep.findById(idNot).orElseThrow(null);
		Curso curso = curRep.findById(idCur).orElseThrow(null);
		notas.setCurso(curso);
		return notRep.save(notas);
	}

}
