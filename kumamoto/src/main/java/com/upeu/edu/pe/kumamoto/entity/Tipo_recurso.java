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
@Table(name="tipo_recurso")
public class Tipo_recurso implements Serializable{
	private static final long serialVersionUID = 8326493188953673321L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtipo_recurso;
	@Column(length = 50)
	private String enlaces;
	private String documentos;
	private String foros;
	@ManyToOne
	@JoinColumn(name="idsession")
	Session idsession;
	public Tipo_recurso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo_recurso(Long idtipo_recurso, String enlaces, String documentos, String foros, Session idsession) {
		super();
		this.idtipo_recurso = idtipo_recurso;
		this.enlaces = enlaces;
		this.documentos = documentos;
		this.foros = foros;
		this.idsession = idsession;
	}
	public Long getIdtipo_recurso() {
		return idtipo_recurso;
	}
	public void setIdtipo_recurso(Long idtipo_recurso) {
		this.idtipo_recurso = idtipo_recurso;
	}
	public String getEnlaces() {
		return enlaces;
	}
	public void setEnlaces(String enlaces) {
		this.enlaces = enlaces;
	}
	public String getDocumentos() {
		return documentos;
	}
	public void setDocumentos(String documentos) {
		this.documentos = documentos;
	}
	public String getForos() {
		return foros;
	}
	public void setForos(String foros) {
		this.foros = foros;
	}
	public Session getIdsession() {
		return idsession;
	}
	public void setIdsession(Session idsession) {
		this.idsession = idsession;
	}
	
}

