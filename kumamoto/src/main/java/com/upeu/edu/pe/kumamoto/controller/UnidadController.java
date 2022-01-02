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

import com.upeu.edu.pe.kumamoto.entity.Unidad;
import com.upeu.edu.pe.kumamoto.service.UnidadService;

@RequestMapping("/apisis")
@RestController
public class UnidadController {

	@Autowired
	private UnidadService unidadService;
	
	@GetMapping("/unidad")
	public List<Unidad> readAll(){
		return (List<Unidad>) unidadService.findAll();
	}
	@GetMapping("/unidad/{idunidad}")
	public Unidad read (@PathVariable Long idunidad) {
		return unidadService.findById(idunidad);
	}
	@PostMapping("/saveuni")
	@ResponseStatus(HttpStatus.CREATED)
	public Unidad create(Unidad unidad) {
		return unidadService.save(unidad);
		
	}
	@PutMapping("/edituni/{idunidad}")
	public Unidad update (@RequestBody Unidad unidad, @PathVariable Long idunidad) {
		Unidad editar_unidad = unidadService.findById(idunidad);
		
		editar_unidad.setNom_unidad(unidad.getNom_unidad());
		editar_unidad.setIdcursos(unidad.getIdcursos());
		return unidadService.save(editar_unidad);
	}
	@DeleteMapping("/deleteuni/{idunidad}")
	public void delete(@PathVariable Long idunidad) {
		unidadService.delete(idunidad);
	}
	}
