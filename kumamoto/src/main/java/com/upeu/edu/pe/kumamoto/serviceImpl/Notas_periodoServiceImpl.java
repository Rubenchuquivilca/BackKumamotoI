package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.Notas_periodoDao;
import com.upeu.edu.pe.kumamoto.entity.Notas_periodo;
import com.upeu.edu.pe.kumamoto.service.Notas_periodoService;

@Service
@Transactional
public class Notas_periodoServiceImpl implements Notas_periodoService{
	
	@Autowired
	private Notas_periodoDao notas_periodoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Notas_periodo> findAll() {
		// TODO Auto-generated method stub
		return (List<Notas_periodo>) notas_periodoDao.findAll();
	}

	

	@Override
	public Notas_periodo save(Notas_periodo notas_periodo) {
		// TODO Auto-generated method stub
		return notas_periodoDao.save(notas_periodo);
	}

	@Override
	public void delete(Long idnotas_periodo) {
		// TODO Auto-generated method stub
		notas_periodoDao.deleteById(idnotas_periodo);
	}



	@Override
	public Notas_periodo findById(Long idnotas_periodo) {
		// TODO Auto-generated method stub
		return notas_periodoDao.findById(idnotas_periodo).orElse(null);
	}
	}