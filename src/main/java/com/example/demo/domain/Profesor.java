package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
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
	@OneToMany(mappedBy = "profesor")	          
	private List<Curso> curso = new ArrayList<>();
}
