package com.upeu.edu.pe.kumamoto.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.kumamoto.entity.Nota;

@Repository
public interface NotaDao extends CrudRepository<Nota, Long>{

}
