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

import com.upeu.edu.pe.kumamoto.entity.Nivel;
import com.upeu.edu.pe.kumamoto.service.NivelService;

@RequestMapping("/apisis")
@RestController
public class NivelController {
	
	@Autowired
	private NivelService nivelService;
	
	@GetMapping("/nivel")
	public List<Nivel> readAll(){
		return (List<Nivel>) nivelService.findAll();
	}
	@GetMapping("/nivel/{idnivel}")
	public Nivel read (@PathVariable Long idnivel) {
		return nivelService.findById(idnivel);
	}
	@PostMapping("/saveniv")
	@ResponseStatus(HttpStatus.CREATED)
	public Nivel create(Nivel nivel) {
		return nivelService.save(nivel);
	}
	@PutMapping("/editniv/{idnivel}")
	public Nivel update (@RequestBody Nivel nivel, @PathVariable Long idnivel) {
		Nivel editar_nivel = nivelService.findById(idnivel);
		
		editar_nivel.setNombre_niv(nivel.getNombre_niv());
		editar_nivel.setIdgrado(nivel.getIdgrado());
		
		return nivelService.save(editar_nivel);
	}
	@DeleteMapping("/deleteuni/{idnivel}")
	public void delete(@PathVariable Long idnivel) {
	nivelService.delete(idnivel);
	
}
}
