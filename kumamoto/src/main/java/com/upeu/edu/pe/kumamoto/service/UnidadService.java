package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Unidad;

public interface UnidadService {

	public List<Unidad> findAll();
	public Unidad findById(Long idunidad); 
	public Unidad save(Unidad unidad);
	public void delete(Long idunidad);
}
