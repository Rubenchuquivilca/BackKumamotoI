package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.Tipo_recursoDao;
import com.upeu.edu.pe.kumamoto.entity.Tipo_recurso;
import com.upeu.edu.pe.kumamoto.service.Tipo_recursoService;

@Service
public class Tipo_recursoServiceImpl implements Tipo_recursoService{
	
	@Autowired
	private Tipo_recursoDao tipo_recursoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipo_recurso> findAll() {
		// TODO Auto-generated method stub
		return (List<Tipo_recurso>) tipo_recursoDao.findAll();
	}

	@Override
	public Tipo_recurso findById(Long idtipo_recurso) {
		// TODO Auto-generated method stub
		return tipo_recursoDao.findById(idtipo_recurso).orElse(null);
	}

	@Override
	public Tipo_recurso save(Tipo_recurso tipo_recurso) {
		// TODO Auto-generated method stub
		return tipo_recursoDao.save(tipo_recurso);
	}

	@Override
	public void delete(Long idtipo_recurso) {
		// TODO Auto-generated method stub
		tipo_recursoDao.deleteById(idtipo_recurso);
	}

}
