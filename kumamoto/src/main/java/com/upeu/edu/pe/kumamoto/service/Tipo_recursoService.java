package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Tipo_recurso;

public interface Tipo_recursoService {
	
	public List<Tipo_recurso> findAll();
	public Tipo_recurso findById(Long idtipo_recurso);
	public Tipo_recurso save(Tipo_recurso tipo_recurso);
	public void delete(Long idtipo_recurso);
}
