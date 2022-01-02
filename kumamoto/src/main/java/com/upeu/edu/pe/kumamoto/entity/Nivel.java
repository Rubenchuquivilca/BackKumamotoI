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
@Table(name="nivel")
public class Nivel implements Serializable{
	private static final long serialVersionUID = 8326493188953673321L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idnivel;
	@Column(length = 50)
	private String nombre_niv;
	@ManyToOne
	@JoinColumn(name="idgrado")
	Grado idgrado;
	public Nivel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nivel(Long idnivel, String nombre_niv, Grado idgrado) {
		super();
		this.idnivel = idnivel;
		this.nombre_niv = nombre_niv;
		this.idgrado = idgrado;
	}
	public Long getIdnivel() {
		return idnivel;
	}
	public void setIdnivel(Long idnivel) {
		this.idnivel = idnivel;
	}
	public String getNombre_niv() {
		return nombre_niv;
	}
	public void setNombre_niv(String nombre_niv) {
		this.nombre_niv = nombre_niv;
	}
	public Grado getIdgrado() {
		return idgrado;
	}
	public void setIdgrado(Grado idgrado) {
		this.idgrado = idgrado;
	}
	
}

