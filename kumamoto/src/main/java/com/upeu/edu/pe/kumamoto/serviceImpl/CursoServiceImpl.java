package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.CursoDao;
import com.upeu.edu.pe.kumamoto.entity.Curso;
import com.upeu.edu.pe.kumamoto.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoDao cursoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return (List<Curso>) cursoDao.findAll();
	}

	@Override
	public Curso findById(Long idcursos) {
		// TODO Auto-generated method stub
		return cursoDao.findById(idcursos).orElse(null);
	}

	@Override
	public Curso save(Curso curso) {
		// TODO Auto-generated method stub
		return cursoDao.save(curso);
	}

	@Override
	public void delete(Long idcursos) {
		// TODO Auto-generated method stub
		cursoDao.deleteById(idcursos);
	}

}
