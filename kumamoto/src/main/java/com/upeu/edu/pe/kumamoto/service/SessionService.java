package com.upeu.edu.pe.kumamoto.service;

import java.util.List;

import com.upeu.edu.pe.kumamoto.entity.Session;

public interface SessionService {
	
	public List<Session> findAll();
	public Session findById(Long idsession); 
	public Session save(Session session);
	public void delete(Long idsession);
}
