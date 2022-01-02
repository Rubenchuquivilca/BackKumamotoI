package com.upeu.edu.pe.kumamoto.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.kumamoto.entity.Notas_periodo;

@Repository
public interface Notas_periodoDao extends CrudRepository<Notas_periodo, Long> {

}
