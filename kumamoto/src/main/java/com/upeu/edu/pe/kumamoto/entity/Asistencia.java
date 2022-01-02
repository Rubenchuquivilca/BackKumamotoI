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
@Table(name="asistencia")
public class Asistencia implements Serializable{
	
private static final long serialVersionUID = 8326493188953673321L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idasistencia;
	@Column(length=45)
	private String tipo_asistencia;
	private String inas_justificada;
	private String inas_injustificada;
	private String tard_justificada;
	private String tard_injustificada;
	private Date fecha_asis;
	private int estado;
	@ManyToOne
	@JoinColumn(name="idestudiante")
	Estudiante idestudiante;
	
	public Asistencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asistencia(Long idasistencia, String tipo_asistencia, String inas_justificada, String inas_injustificada,
			String tard_justificada, String tard_injustificada, Date fecha_asis, int estado, Estudiante idestudiante) {
		super();
		this.idasistencia = idasistencia;
		this.tipo_asistencia = tipo_asistencia;
		this.inas_justificada = inas_justificada;
		this.inas_injustificada = inas_injustificada;
		this.tard_justificada = tard_justificada;
		this.tard_injustificada = tard_injustificada;
		this.fecha_asis = fecha_asis;
		this.estado = estado;
		this.idestudiante = idestudiante;
	}

	public Long getIdasistencia() {
		return idasistencia;
	}

	public void setIdasistencia(Long idasistencia) {
		this.idasistencia = idasistencia;
	}

	public String getTipo_asistencia() {
		return tipo_asistencia;
	}

	public void setTipo_asistencia(String tipo_asistencia) {
		this.tipo_asistencia = tipo_asistencia;
	}

	public String getInas_justificada() {
		return inas_justificada;
	}

	public void setInas_justificada(String inas_justificada) {
		this.inas_justificada = inas_justificada;
	}

	public String getInas_injustificada() {
		return inas_injustificada;
	}

	public void setInas_injustificada(String inas_injustificada) {
		this.inas_injustificada = inas_injustificada;
	}

	public String getTard_justificada() {
		return tard_justificada;
	}

	public void setTard_justificada(String tard_justificada) {
		this.tard_justificada = tard_justificada;
	}

	public String getTard_injustificada() {
		return tard_injustificada;
	}

	public void setTard_injustificada(String tard_injustificada) {
		this.tard_injustificada = tard_injustificada;
	}

	public Date getFecha_asis() {
		return fecha_asis;
	}

	public void setFecha_asis(Date fecha_asis) {
		this.fecha_asis = fecha_asis;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Estudiante getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(Estudiante idestudiante) {
		this.idestudiante = idestudiante;
	}

	
}
