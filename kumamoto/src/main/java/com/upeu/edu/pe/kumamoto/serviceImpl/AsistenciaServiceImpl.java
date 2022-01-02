package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.AsistenciaDao;
import com.upeu.edu.pe.kumamoto.entity.Asistencia;
import com.upeu.edu.pe.kumamoto.service.AsistenciaService;

@Service
public class AsistenciaServiceImpl implements AsistenciaService{
	
	@Autowired
	private AsistenciaDao asistenciaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Asistencia> findAll() {
		// TODO Auto-generated method stub
		return (List<Asistencia>) asistenciaDao.findAll();
	}

	@Override
	public Asistencia findById(Long idasistencia) {
		// TODO Auto-generated method stub
		return asistenciaDao.findById(idasistencia).orElse(null);
	}

	@Override
	public Asistencia save(Asistencia asistencia) {
		// TODO Auto-generated method stub
		return asistenciaDao.save(asistencia);
	}

	@Override
	public void delete(Long idasistencia) {
		// TODO Auto-generated method stub
		asistenciaDao.deleteById(idasistencia);
	}
}
