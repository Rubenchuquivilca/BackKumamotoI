package com.upeu.edu.pe.kumamoto.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upeu.edu.pe.kumamoto.entity.Session;

@Repository
public interface SessionDao extends CrudRepository<Session, Long> {

}
