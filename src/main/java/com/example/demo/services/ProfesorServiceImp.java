package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Profesor;
import com.example.demo.repositories.ProfesorRepository;

import jakarta.transaction.Transactional;

@Service
public class ProfesorServiceImp implements ProfesorService {

	@Autowired
	private ProfesorRepository profRep;
	
	@Override
	@Transactional
	public List<Profesor> listarProfesor() {
		return profRep.findAll();
	}

	@Override
	@Transactional
	public Profesor grabar(Profesor profesor) {
		return profRep.save(profesor);
	}

	@Override
	@Transactional
	public Profesor editar(Profesor profesor, Long id) {
		// TODO Auto-generated method stub
		profesor.setIdProfesor(id);
		return profRep.save(profesor);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		profRep.deleteById(id);

	}

}
