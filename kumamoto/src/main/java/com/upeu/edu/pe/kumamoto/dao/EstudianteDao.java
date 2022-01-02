package com.upeu.edu.pe.kumamoto.dao;

import com.upeu.edu.pe.kumamoto.entity.Estudiante;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteDao extends CrudRepository<Estudiante, Long>{

}
