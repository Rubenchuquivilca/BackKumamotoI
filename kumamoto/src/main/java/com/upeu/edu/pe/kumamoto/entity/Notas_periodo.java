package com.upeu.edu.pe.kumamoto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notas_periodo")
public class Notas_periodo implements Serializable{
	
	private static final long serialVersionUID = -654926197265551465L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idnotas_periodo;
	@Column(length=45)
	public String nom_periodo;
	public Notas_periodo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notas_periodo(Long idnotas_periodo, String nom_periodo) {
		super();
		this.idnotas_periodo = idnotas_periodo;
		this.nom_periodo = nom_periodo;
	}
	public Long getIdnotas_periodo() {
		return idnotas_periodo;
	}
	public void setIdnotas_periodo(Long idnotas_periodo) {
		this.idnotas_periodo = idnotas_periodo;
	}
	public String getNom_periodo() {
		return nom_periodo;
	}
	public void setNom_periodo(String nom_periodo) {
		this.nom_periodo = nom_periodo;
	}

}
