package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Notas_periodo;

public interface Notas_periodoService {
	public List<Notas_periodo> findAll();
	public Notas_periodo findById(Long idnotas_periodo); 
	public Notas_periodo save(Notas_periodo notas_periodo);
	public void delete(Long idnotas_periodo);
}
