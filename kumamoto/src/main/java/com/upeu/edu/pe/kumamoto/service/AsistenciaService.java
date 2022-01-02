package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Asistencia;

public interface AsistenciaService {
	
	public List<Asistencia> findAll();
	public Asistencia findById(Long idasistencia); 
	public Asistencia save(Asistencia asistencia);
	public void delete(Long idasistencia);
}
