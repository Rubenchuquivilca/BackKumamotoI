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
@Table(name="curso")

public class Curso implements Serializable {
	
	private static final long serialVersionUID = 8326493188953673321L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcursos;
	@Column(length=45)
	private String nombre_cur;
	@Column(length=45)
	private Date fecha_inicio;
	@Column(length=45)
	private Date fecha_fin;
	@Column(length=45)
	private int estado;
	@Column(length=45)
	private String progreso;
	@ManyToOne
	@JoinColumn(name="idgrado")
	Grado idgrado;
	@ManyToOne
	@JoinColumn(name="iddocente")
	Docente iddocente;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	
	}

	public Curso(Long idcursos, String nombre_cur, Date fecha_inicio, Date fecha_fin, int estado, String progreso,
			Grado idgrado, Docente iddocente) {
		super();
		this.idcursos = idcursos;
		this.nombre_cur = nombre_cur;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.estado = estado;
		this.progreso = progreso;
		this.idgrado = idgrado;
		this.iddocente = iddocente;
	}

	public Long getIdcursos() {
		return idcursos;
	}

	public void setIdcursos(Long idcursos) {
		this.idcursos = idcursos;
	}

	public String getNombre_cur() {
		return nombre_cur;
	}

	public void setNombre_cur(String nombre_cur) {
		this.nombre_cur = nombre_cur;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getProgreso() {
		return progreso;
	}

	public void setProgreso(String progreso) {
		this.progreso = progreso;
	}

	public Grado getIdgrado() {
		return idgrado;
	}

	public void setIdgrado(Grado idgrado) {
		this.idgrado = idgrado;
	}

	public Docente getIddocente() {
		return iddocente;
	}

	public void setIddocente(Docente iddocente) {
		this.iddocente = iddocente;
	}
}
