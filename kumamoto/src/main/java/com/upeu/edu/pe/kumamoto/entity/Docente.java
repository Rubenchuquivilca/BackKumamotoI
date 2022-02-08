package com.upeu.edu.pe.kumamoto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="docente")
public class Docente implements Serializable {
	
	private static final long serialVersionUID = 8326493188953673321L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iddocente;
	@Column(length=45)
	private String nombre;
	@Column(length=45)
	private String apellido;
	@Column(length=45)
	private String dni;
	@Column(length=45)
	private String correo;
	@Column(length=45)
	private String direccion;
	@Column(length=45)
	private String celular;
	@Column(length=45)
	private String descripcion;
	
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Docente(Long iddocente, String nombre, String apellido, String dni, String correo, String direccion,
			String celular, String descripcion) {
		super();
		this.iddocente = iddocente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.correo = correo;
		this.direccion = direccion;
		this.celular = celular;
		this.descripcion = descripcion;
	}

	public Long getIddocente() {
		return iddocente;
	}

	public void setIddocente(Long iddocente) {
		this.iddocente = iddocente;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
