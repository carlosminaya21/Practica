package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import jakarta.validation.constraints.Digits;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="idAlumno")
public class Alumno implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAlumno;
	private String nombres;
	private String apellidos;
	@Column (unique = true)
	@Digits (integer = 8, fraction = 0)
	private String dni;
	@Temporal(TemporalType.DATE)
	private Date fechaNaci;
	private String direccion;
	@Column (unique = true)
	private String email;
	@OneToMany(mappedBy = "alumno", cascade = CascadeType.REMOVE)	
	@JsonManagedReference
	private List<Notas> notas;
}
