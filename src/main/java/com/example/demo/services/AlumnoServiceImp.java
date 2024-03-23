package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Alumno;
import com.example.demo.repositories.AlumnoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlumnoServiceImp implements AlumnoService{
	@Autowired
	private AlumnoRepository alumRep;
	
	@Override
	@Transactional
	public List<Alumno> listarAlumno() {
		return alumRep.findAll();
	}

	@Override
	public Alumno grabar(Alumno alumno) {
		// TODO Auto-generated method stub
		return alumRep.save(alumno);
	}

	@Override
	public Alumno editar(Alumno alumno, Long id) {
		// TODO Auto-generated method stub
		alumno.setIdAlumno(id);
		return alumRep.save(alumno);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		alumRep.deleteById(id);
	}
	

}
