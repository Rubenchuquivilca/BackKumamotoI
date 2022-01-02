package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.NotaDao;
import com.upeu.edu.pe.kumamoto.entity.Nota;
import com.upeu.edu.pe.kumamoto.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{
	
	@Autowired
	private NotaDao notaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Nota> findAll() {
		// TODO Auto-generated method stub
		return (List<Nota>) notaDao.findAll();
	}

	@Override
	public Nota findById(Long idnota) {
		// TODO Auto-generated method stub
		return notaDao.findById(idnota).orElse(null);
	}

	@Override
	public Nota save(Nota nota) {
		// TODO Auto-generated method stub
		return notaDao.save(nota);
	}

	@Override
	public void delete(Long idnota) {
		// TODO Auto-generated method stub
		notaDao.deleteById(idnota);
	}
	
}
