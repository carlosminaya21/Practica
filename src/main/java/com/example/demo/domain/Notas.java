package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Notas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNota;
	private String unidad;
	private Double promedio;
	@ManyToOne()
	private Alumno alumno;
	@ManyToOne()
	private Curso curso;
}
