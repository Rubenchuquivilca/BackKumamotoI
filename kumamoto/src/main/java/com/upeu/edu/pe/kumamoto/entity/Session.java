package com.upeu.edu.pe.kumamoto.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="session")
public class Session implements Serializable{
	
private static final long serialVersionUID = 8326493188953673321L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idsession;
	@Column(length=45)
	private String nom_seccion;
	@Column(length=45)
	private String descripcion;
	@Column(length=45)
	private Date fecha_ini;
	@Column(length=45)
	private Date fecha_fin;
	@ManyToOne
	@JoinColumn(name="idunidad")
	Unidad idunidad;
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Session(Long idsession, String nom_seccion, String descripcion, Date fecha_ini, Date fecha_fin,
			Unidad idunidad) {
		super();
		this.idsession = idsession;
		this.nom_seccion = nom_seccion;
		this.descripcion = descripcion;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.idunidad = idunidad;
	}
	public Long getIdsession() {
		return idsession;
	}
	public void setIdsession(Long idsession) {
		this.idsession = idsession;
	}
	public String getNom_seccion() {
		return nom_seccion;
	}
	public void setNom_seccion(String nom_seccion) {
		this.nom_seccion = nom_seccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_ini() {
		return fecha_ini;
	}
	public void setFecha_ini(Date fecha_ini) {
		this.fecha_ini = fecha_ini;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public Unidad getIdunidad() {
		return idunidad;
	}
	public void setIdunidad(Unidad idunidad) {
		this.idunidad = idunidad;
	}

	
}
