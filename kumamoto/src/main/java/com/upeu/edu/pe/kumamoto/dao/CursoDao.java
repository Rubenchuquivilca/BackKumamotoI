package com.upeu.edu.pe.kumamoto.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.upeu.edu.pe.kumamoto.entity.Curso;
import com.upeu.edu.pe.kumamoto.entity.Grado;

public interface CursoDao extends CrudRepository<Curso, Long>{
	List<Curso> findCursoByIdgrado(Grado idgrado);
}