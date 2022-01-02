package com.upeu.edu.pe.kumamoto.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.kumamoto.entity.Tipo_recurso;

@Repository
public interface Tipo_recursoDao extends CrudRepository<Tipo_recurso, Long> {

}
