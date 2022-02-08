package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.DocenteDao;
import com.upeu.edu.pe.kumamoto.entity.Docente;
import com.upeu.edu.pe.kumamoto.service.DocenteService;

@Service
public class DocenteServiceImpl implements DocenteService{
	
	@Autowired
	private DocenteDao docenteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Docente> findAll() {
		// TODO Auto-generated method stub
		return (List<Docente>) docenteDao.findAll();
	}

	@Override
	public Docente findById(Long iddocente) {
		// TODO Auto-generated method stub
		return docenteDao.findById(iddocente).orElse(null);
	}

	@Override
	public Docente save(Docente docente) {
		// TODO Auto-generated method stub
		return docenteDao.save(docente);
	}

	@Override
	public void delete(Long iddocente) {
		// TODO Auto-generated method stub
		docenteDao.deleteById(iddocente);
	}
}
