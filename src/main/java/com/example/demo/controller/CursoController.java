package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Curso;
import com.example.demo.services.CursoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/curso")
public class CursoController {
	@Autowired
	private CursoService cursSer;
	
	@GetMapping
	public List<Curso> listarCurso(){
		return cursSer.listarCurso();
	}
	
	@PostMapping
	public Curso crearCurso(@RequestBody Curso curso) {
		return cursSer.grabar(curso);
	}
	
	@PutMapping("/{id}")
	public Curso editarCurso(@PathVariable Long id,@RequestBody Curso curso) {
		return cursSer.Editar(curso, id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCurso(@PathVariable Long id) {
		cursSer.eliminar(id);
	}
	

	@PutMapping(value = "/{idCur}/profesor/{idProfe}")
	public Curso asignarProfesor(@PathVariable Long idCur,@PathVariable Long idProfe) {
		return cursSer.asignarProfesor(idCur, idProfe);
	}

	 
	
}
