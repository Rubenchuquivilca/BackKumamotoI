package com.upeu.edu.pe.kumamoto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.kumamoto.entity.Grado;
import com.upeu.edu.pe.kumamoto.service.GradoService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apisis")
@RestController
public class GradoController {
	
	@Autowired
	private GradoService gradoService;
	
	@GetMapping("/grado")
	public List<Grado> readAll(){
		return (List<Grado>) gradoService.findAll();
	}
	@GetMapping("/grado/{idgrado}")
	public Grado read (@PathVariable Long idgrado) {
		return gradoService.findById(idgrado);
	}
	@PostMapping("/savegra")
	@ResponseStatus(HttpStatus.CREATED)
	public Grado create(@Valid @RequestBody Grado grado) {
		return gradoService.save(grado);
	}
	@PutMapping("/editgra/{idgrado}")
	public Grado update (@RequestBody Grado grado, @PathVariable Long idgrado) {
		Grado editar_grado = gradoService.findById(idgrado);
		
		editar_grado.setNom_grado(grado.getNom_grado());
		editar_grado.setNom_seccion(grado.getNom_seccion());
		editar_grado.setNom_tutor(grado.getNom_tutor());
		
		return gradoService.save(editar_grado);
	}
	@DeleteMapping("/deletegra/{idgrado}")
	public void delete(@PathVariable Long idgrado) {
		gradoService.delete(idgrado);
	}
}
