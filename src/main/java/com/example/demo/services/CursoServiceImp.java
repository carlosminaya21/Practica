package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Curso;
import com.example.demo.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoServiceImp implements CursoService {

	@Autowired
	private CursoRepository cursRepo;
	
	
	@Override
	@Transactional
	public List<Curso> listarCurso() {
		return cursRepo.findAll();
	}

	@Override
	@Transactional
	public Curso grabar(Curso curso) {
		return cursRepo.save(curso);
	}

	@Override
	@Transactional
	public Curso Editar(Curso curso, Long id) {
		curso.setIdCurso(id);
		return cursRepo.save(curso);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		cursRepo.deleteById(id);
		// TODO Auto-generated method stub

	}

}
