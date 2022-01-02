package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.EstudianteDao;
import com.upeu.edu.pe.kumamoto.entity.Estudiante;
import com.upeu.edu.pe.kumamoto.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	
	@Autowired
	private EstudianteDao estudianteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return (List<Estudiante>) estudianteDao.findAll();
	}

	@Override
	public Estudiante findById(Long idestudiante) {
		// TODO Auto-generated method stub
		return estudianteDao.findById(idestudiante).orElse(null);
	}

	@Override
	public Estudiante save(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return estudianteDao.save(estudiante);
	}

	@Override
	public void delete(Long idestudiante) {
		// TODO Auto-generated method stub
		estudianteDao.deleteById(idestudiante);
	}
}
