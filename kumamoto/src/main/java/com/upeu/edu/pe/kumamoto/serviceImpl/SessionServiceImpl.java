package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.edu.pe.kumamoto.dao.SessionDao;
import com.upeu.edu.pe.kumamoto.entity.Session;
import com.upeu.edu.pe.kumamoto.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService{
	
	@Autowired 
	 private SessionDao sessionDao;
	
	@Override
	public List<Session> findAll() {
		// TODO Auto-generated method stub
		return (List<Session>) sessionDao.findAll();
	}

	@Override
	public Session findById(Long idsession) {
		// TODO Auto-generated method stub
		return sessionDao.findById(idsession).orElse(null);
	}

	@Override
	public Session save(Session session) {
		// TODO Auto-generated method stub
		return sessionDao.save(session);
	}

	@Override
	public void delete(Long idsession) {
		// TODO Auto-generated method stub
		sessionDao.deleteById(idsession);
	}

}
