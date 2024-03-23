package com.example.demo.domain;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCurso;
	private String nombreCurso;
	@ManyToOne
	private Profesor profesor;
	@OneToMany(mappedBy = "curso", cascade = CascadeType.REMOVE)
	@JsonManagedReference
	private List<Notas> notas;
	
	
}
