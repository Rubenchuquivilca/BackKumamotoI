package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Curso;

public interface CursoService {
	public List<Curso>findAll();
	public Curso findById(Long idcursos);
	public Curso save(Curso curso);
	public void delete (Long idcursos);
}
