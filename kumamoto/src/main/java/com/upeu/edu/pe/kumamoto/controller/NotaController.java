package com.upeu.edu.pe.kumamoto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.kumamoto.entity.Nota;
import com.upeu.edu.pe.kumamoto.service.NotaService;

@RequestMapping("/apisis")
@RestController
public class NotaController {
	
	@Autowired
	private NotaService notaService;
	
	@GetMapping("/nota")
	public List<Nota> readAll(){
		return (List<Nota>) notaService.findAll();
	}

	@GetMapping("/nota/{idnota}")
	public Nota read (@PathVariable Long idnota) {
		return notaService.findById(idnota);
	}

	@PostMapping("/savenota")
	@ResponseStatus(HttpStatus.CREATED)
	private Nota create(Nota nota) {
		return notaService.save(nota);
	}

	@PutMapping("/editnot/{idnota}")
	public Nota update (@RequestBody Nota nota, @PathVariable Long idnota) {
		Nota editar_nota = notaService.findById(idnota);
		
		editar_nota.setNota1(nota.getNota1());
		editar_nota.setNota2(nota.getNota2());
		editar_nota.setNota3(nota.getNota3());
		editar_nota.setNota4(nota.getNota4());
		editar_nota.setPromedio(nota.getPromedio());
		editar_nota.setIdcursos(nota.getIdcursos());
		editar_nota.setIdestudiante(nota.getIdestudiante());
		editar_nota.setIdnotas_periodo(nota.getIdnotas_periodo());
		
		return notaService.save(editar_nota);
	}

	@DeleteMapping("/deletenot/{idnota}")
	public void delete(@PathVariable Long idnota) {
		notaService.delete(idnota);
	}


}
