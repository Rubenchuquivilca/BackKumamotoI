package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Curso;
import com.upeu.edu.pe.kumamoto.entity.Nota;

public interface NotaService {
	
	public List<Nota> findAll();
	public Nota findById(Long idnota); 
	public Nota save(Nota nota);
	public void delete(Long idnota);

	List<Nota> getNotasByCurso(Long idCurso);
}
