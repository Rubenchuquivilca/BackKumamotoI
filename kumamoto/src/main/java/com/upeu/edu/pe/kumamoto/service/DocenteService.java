package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Docente;

public interface DocenteService {
	public List<Docente>findAll();
	public Docente findById(Long iddocente);
	public Docente save(Docente docente);
	public void delete (Long iddocente);
}
