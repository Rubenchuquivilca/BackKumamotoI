package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.UnidadDao;
import com.upeu.edu.pe.kumamoto.entity.Unidad;
import com.upeu.edu.pe.kumamoto.service.UnidadService;

@Service
public class UnidadServiceImpl implements UnidadService {
	
	@Autowired
	private UnidadDao unidadDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Unidad> findAll() {
		// TODO Auto-generated method stub
		return (List<Unidad>) unidadDao.findAll();
	}

	@Override
	public Unidad findById(Long idunidad) {
		// TODO Auto-generated method stub
		return unidadDao.findById(idunidad).orElse(null);
	}

	@Override
	public Unidad save(Unidad unidad) {
		// TODO Auto-generated method stub
		return unidadDao.save(unidad);
	}

	@Override
	public void delete(Long idunidad) {
		// TODO Auto-generated method stub
		unidadDao.deleteById(idunidad);
	}

}
