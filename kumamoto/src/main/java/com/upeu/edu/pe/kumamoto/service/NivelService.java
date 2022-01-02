package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Nivel;

public interface NivelService {
	
	public List<Nivel> findAll();
	public Nivel findById(Long idnivel); 
	public Nivel save(Nivel nivel);
	public void delete(Long idnivel);
}
