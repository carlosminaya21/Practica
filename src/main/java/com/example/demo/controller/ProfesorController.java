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

import com.example.demo.domain.Profesor;
import com.example.demo.services.ProfesorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/profesor")
public class ProfesorController {
	@Autowired
	private ProfesorService proServ;
	
	@GetMapping
	public List<Profesor> listarProfesor(){
		return proServ.listarProfesor();
	}
	
	@PostMapping
	public Profesor crearProfesor(@RequestBody Profesor profesor) {
		return proServ.grabar(profesor);
	}
	
	@PutMapping("/{id}")
	public Profesor editarProfesor(@PathVariable Long id,@RequestBody @Valid Profesor profesor) {
		return proServ.editar(profesor, id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarProfesor(@PathVariable Long id) {
		proServ.eliminar(id);
	}
	
	
}
