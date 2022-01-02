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
@Table(name="estudiante")
public class Estudiante implements Serializable{
	private static final long serialVersionUID = 8326493188953673321L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idestudiante;
	@Column(length = 50)
	private String codigo_estu;
	private String nombre;
	private String apellido;
	private String direccion;
	private String celular;
	private Date fecha_nac;
	private String descripcion;
	@ManyToOne
	@JoinColumn(name="idgrado")
	Grado idgrado;
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estudiante(Long idestudiante, String codigo_estu, String nombre, String apellido, String direccion,
			String celular, Date fecha_nac, String descripcion, Grado idgrado) {
		super();
		this.idestudiante = idestudiante;
		this.codigo_estu = codigo_estu;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.celular = celular;
		this.fecha_nac = fecha_nac;
		this.descripcion = descripcion;
		this.idgrado = idgrado;
	}
	public Long getIdestudiante() {
		return idestudiante;
	}
	public void setIdestudiante(Long idestudiante) {
		this.idestudiante = idestudiante;
	}
	public String getCodigo_estu() {
		return codigo_estu;
	}
	public void setCodigo_estu(String codigo_estu) {
		this.codigo_estu = codigo_estu;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Grado getIdgrado() {
		return idgrado;
	}
	public void setIdgrado(Grado idgrado) {
		this.idgrado = idgrado;
	}
	
}

