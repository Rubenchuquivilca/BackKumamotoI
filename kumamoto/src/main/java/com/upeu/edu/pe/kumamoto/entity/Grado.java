package com.upeu.edu.pe.kumamoto.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grado")
public class Grado implements Serializable {
	
	private static final long serialVersionUID = 8326493188953673321L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idgrado;
	@Column(length=45)
	private String nom_grado;
	@Column(length=45)
	private String nom_seccion;
	@Column(length=45)
	private String nom_tutor;
	@OneToMany(mappedBy="idgrado")
	private List<Curso> cursos;
	
	public Grado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grado(Long idgrado, String nom_grado, String nom_seccion, String nom_tutor) {
		super();
		this.idgrado = idgrado;
		this.nom_grado = nom_grado;
		this.nom_seccion = nom_seccion;
		this.nom_tutor = nom_tutor;
	}
	public Long getIdgrado() {
		return idgrado;
	}
	public void setIdgrado(Long idgrado) {
		this.idgrado = idgrado;
	}
	public String getNom_grado() {
		return nom_grado;
	}
	public void setNom_grado(String nom_grado) {
		this.nom_grado = nom_grado;
	}
	public String getNom_seccion() {
		return nom_seccion;
	}
	public void setNom_seccion(String nom_seccion) {
		this.nom_seccion = nom_seccion;
	}
	public String getNom_tutor() {
		return nom_tutor;
	}
	public void setNom_tutor(String nom_tutor) {
		this.nom_tutor = nom_tutor;
	}
	
}
