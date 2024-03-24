package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Alumno;
import com.example.demo.services.AlumnoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoController {
	@Autowired
	private AlumnoService alumService;
	
	@GetMapping
	public List<Alumno> listarAlumnos(){
		return alumService.listarAlumno();
	}
	
	@PostMapping
	public Alumno crearAlumno(@RequestBody Alumno alumno) {
		return alumService.grabar(alumno);
	}
	
	@PutMapping("/{id}")
	public Alumno editarAlumno(@PathVariable Long id,@RequestBody Alumno alum) {
		return alumService.editar(alum, id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarAlumno(@PathVariable Long id) {
		 alumService.eliminar(id);
	}
	
	

}
