package com.upeu.edu.pe.kumamoto.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.kumamoto.entity.Asistencia;

@Repository
public interface AsistenciaDao extends CrudRepository<Asistencia, Long>{

}
