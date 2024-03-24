package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="idCurso")
public class Notas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNota;
	private String unidad;
	private Double promedio;
	@ManyToOne()
	@JsonBackReference
	private Alumno alumno;
	@ManyToOne()
	@JsonBackReference
	private Curso curso;
}
