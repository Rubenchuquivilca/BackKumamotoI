package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.NivelDao;
import com.upeu.edu.pe.kumamoto.entity.Nivel;
import com.upeu.edu.pe.kumamoto.service.NivelService;

@Service
public class NivelServiceImpl implements NivelService{
	
	@Autowired
	private NivelDao nivelDao;

	@Override
	@Transactional(readOnly = true)
	public List<Nivel> findAll() {
		// TODO Auto-generated method stub
		return (List<Nivel>) nivelDao.findAll();
	}

	@Override
	public Nivel findById(Long idnivel) {
		// TODO Auto-generated method stub
		return nivelDao.findById(idnivel).orElse(null);
	}

	@Override
	public Nivel save(Nivel nivel) {
		// TODO Auto-generated method stub
		return nivelDao.save(nivel);
	}

	@Override
	public void delete(Long idnivel) {
		// TODO Auto-generated method stub
		nivelDao.deleteById(idnivel);
	} 
}
