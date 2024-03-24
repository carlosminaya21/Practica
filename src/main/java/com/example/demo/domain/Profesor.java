package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="idProfesor")
public class Profesor implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProfesor;
	private String nombres;
	private String apellidos;
	@Column (unique = true)
	private String dni;
	private String direccion;
	@Column (unique = true)
	private String email;
	@OneToMany(mappedBy = "profesor", cascade = CascadeType.REMOVE)
	@JsonManagedReference
	private List<Curso> curso;
}
