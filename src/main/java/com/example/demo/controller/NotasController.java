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

import com.example.demo.domain.Notas;
import com.example.demo.services.NotasService;

@RestController
@RequestMapping("/api/v1/notas")
public class NotasController {
	@Autowired
	private NotasService notSer;
	
	@GetMapping
	public List<Notas> listarNotas(){
		return notSer.listarNotas();
	}
	
	@PostMapping
	public Notas crearNotas(@RequestBody Notas notas) {
		return notSer.grabar(notas);
	}
	
	@PutMapping
	public Notas editarNotas(@PathVariable Long id, @RequestBody Notas notas) {
		return notSer.editar(notas, id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarNotas(@PathVariable Long id) {
		notSer.eliminar(id);
	}
	
	//ASIGNAR ALUMNO A NOTAS Long idNot, Long idAlum
	@PutMapping(value = "/{idNot}/alumno/{idAlum}")
	public Notas asignarAlumno(@PathVariable Long idNot,@PathVariable Long idAlum) {
		return notSer.asignarAlumno(idNot, idAlum);
	}
	
	//ASIGNAR Curso A NOTAS Long idNot, Long idCur
		@PutMapping(value = "/{idNot}/curso/{idCur}")
		public Notas asignarCurso(@PathVariable Long idNot,@PathVariable Long idCur) {
			return notSer.asignarCurso(idNot, idCur);
		}
	
	
	
	
	

}
