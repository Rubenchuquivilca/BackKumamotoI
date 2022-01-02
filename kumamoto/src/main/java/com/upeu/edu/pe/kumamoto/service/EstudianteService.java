package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Estudiante;

public interface EstudianteService {
	
	public List<Estudiante> findAll();
	public Estudiante findById(Long idestudiante); 
	public Estudiante save(Estudiante estudiante);
	public void delete(Long idestudiante);
}
