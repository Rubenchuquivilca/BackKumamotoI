package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.GradoDao;
import com.upeu.edu.pe.kumamoto.entity.Grado;
import com.upeu.edu.pe.kumamoto.service.GradoService;

@Service
public class GradoServiceImpl implements GradoService{
	
	@Autowired
	private GradoDao gradoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Grado> findAll() {
		// TODO Auto-generated method stub
		return (List<Grado>) gradoDao.findAll();
	}

	@Override
	public Grado findById(Long idgrado) {
		// TODO Auto-generated method stub
		return gradoDao.findById(idgrado).orElse(null);
	}

	@Override
	public Grado save(Grado grado) {
		// TODO Auto-generated method stub
		return gradoDao.save(grado);
	}

	@Override
	public void delete(Long idgrado) {
		// TODO Auto-generated method stub
		gradoDao.deleteById(idgrado);
	}

}
