package com.upeu.edu.pe.kumamoto.dao;

import com.upeu.edu.pe.kumamoto.entity.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.kumamoto.entity.Nota;

import java.util.List;

@Repository
public interface NotaDao extends CrudRepository<Nota, Long>{

    List<Nota> findNotaByIdcursos(Curso curso);

}
