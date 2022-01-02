package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Grado;


public interface GradoService {
	
	public List<Grado> findAll();
	public Grado findById(Long idgrado); 
	public Grado save(Grado grado);
	public void delete(Long idgrado);
}
