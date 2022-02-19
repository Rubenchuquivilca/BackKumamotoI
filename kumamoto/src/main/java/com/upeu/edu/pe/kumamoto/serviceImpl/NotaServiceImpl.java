package com.upeu.edu.pe.kumamoto.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.upeu.edu.pe.kumamoto.dao.CursoDao;
import com.upeu.edu.pe.kumamoto.entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upeu.edu.pe.kumamoto.dao.NotaDao;
import com.upeu.edu.pe.kumamoto.entity.Nota;
import com.upeu.edu.pe.kumamoto.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{

	private static final Integer DEFAULT_SIZE = 10;
	
	@Autowired
	private NotaDao notaDao;

	@Autowired
	private CursoDao cursoDao;
	
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

	@Override
	public List<Nota> getNotasByCurso(Long idCurso) {

		List<Nota> notasByCurso = new ArrayList<Nota>(DEFAULT_SIZE);

		Curso cursoEncontrado = cursoDao.findById( idCurso ).orElse( null );

		if (cursoEncontrado != null) notasByCurso = notaDao.findNotaByIdcursos( cursoEncontrado );

		return notasByCurso;

	}

}
