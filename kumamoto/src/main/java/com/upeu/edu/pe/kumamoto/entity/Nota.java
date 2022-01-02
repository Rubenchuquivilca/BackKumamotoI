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
@Table(name="nota")
public class Nota implements Serializable{
	private static final long serialVersionUID = 8326493188953673321L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idnota;
	@Column(length = 45)
	private String nota1;
	private String nota2;
	private String nota3;
	private String nota4;
	private String promedio;
	@ManyToOne
	@JoinColumn(name="idestudiante")
	Estudiante idestudiante;
	@ManyToOne
	@JoinColumn(name="idcursos")
	Curso idcursos;
	@ManyToOne
	@JoinColumn(name="idnotas_periodo")
	Notas_periodo idnotas_periodo;
	
	public Nota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nota(Long idnota, String nota1, String nota2, String nota3, String nota4, String promedio,
			Estudiante idestudiante, Curso idcursos, Notas_periodo idnotas_periodo) {
		super();
		this.idnota = idnota;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.promedio = promedio;
		this.idestudiante = idestudiante;
		this.idcursos = idcursos;
		this.idnotas_periodo = idnotas_periodo;
	}

	public Long getIdnota() {
		return idnota;
	}

	public void setIdnota(Long idnota) {
		this.idnota = idnota;
	}

	public String getNota1() {
		return nota1;
	}

	public void setNota1(String nota1) {
		this.nota1 = nota1;
	}

	public String getNota2() {
		return nota2;
	}

	public void setNota2(String nota2) {
		this.nota2 = nota2;
	}

	public String getNota3() {
		return nota3;
	}

	public void setNota3(String nota3) {
		this.nota3 = nota3;
	}

	public String getNota4() {
		return nota4;
	}

	public void setNota4(String nota4) {
		this.nota4 = nota4;
	}

	public String getPromedio() {
		return promedio;
	}

	public void setPromedio(String promedio) {
		this.promedio = promedio;
	}

	public Estudiante getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(Estudiante idestudiante) {
		this.idestudiante = idestudiante;
	}

	public Curso getIdcursos() {
		return idcursos;
	}

	public void setIdcursos(Curso idcursos) {
		this.idcursos = idcursos;
	}

	public Notas_periodo getIdnotas_periodo() {
		return idnotas_periodo;
	}

	public void setIdnotas_periodo(Notas_periodo idnotas_periodo) {
		this.idnotas_periodo = idnotas_periodo;
	}

}
