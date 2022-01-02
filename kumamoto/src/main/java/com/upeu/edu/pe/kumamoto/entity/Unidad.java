package com.upeu.edu.pe.kumamoto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="unidad")
public class Unidad implements Serializable{

	private static final long serialVersionUID = 8326493188953673321L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idunidad;
	@Column(length=45)
	private String nom_unidad;
	@ManyToOne
	@JoinColumn(name="idcursos")
	Curso idcursos;
	
	public Unidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Unidad(Long idunidad, String nom_unidad, Curso idcursos) {
		super();
		this.idunidad = idunidad;
		this.nom_unidad = nom_unidad;
		this.idcursos = idcursos;
	}

	public Long getIdunidad() {
		return idunidad;
	}

	public void setIdunidad(Long idunidad) {
		this.idunidad = idunidad;
	}

	public String getNom_unidad() {
		return nom_unidad;
	}

	public void setNom_unidad(String nom_unidad) {
		this.nom_unidad = nom_unidad;
	}

	public Curso getIdcursos() {
		return idcursos;
	}

	public void setIdcursos(Curso idcursos) {
		this.idcursos = idcursos;
	}



}
