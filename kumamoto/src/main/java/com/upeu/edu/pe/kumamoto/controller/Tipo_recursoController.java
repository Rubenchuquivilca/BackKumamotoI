package com.upeu.edu.pe.kumamoto.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.upeu.edu.pe.kumamoto.entity.Tipo_recurso;
import com.upeu.edu.pe.kumamoto.service.Tipo_recursoService;

@RequestMapping("/apisis")
@RestController
public class Tipo_recursoController {
	
	@Autowired
	private Tipo_recursoService tipo_recursoService;
	
	@GetMapping("/tipo_recurso")
	public List<Tipo_recurso> readAll(){
		return (List<Tipo_recurso>) tipo_recursoService.findAll();
	}
	@GetMapping("/tipo_recurso/{idtipo_recurso}")
	public Tipo_recurso read (@PathVariable Long idtipo_recurso) {
		return tipo_recursoService.findById(idtipo_recurso);
	}
	@PostMapping("/savetiporecur")
	@ResponseStatus(HttpStatus.CREATED)
	public Tipo_recurso create(@Valid @RequestBody Tipo_recurso tipo_recurso) {
	return tipo_recursoService.save(tipo_recurso);
}	
	@PutMapping("/edittiporec/{idtipo_recurso}")
	public Tipo_recurso update(@RequestBody Tipo_recurso tipo_recurso, @PathVariable Long idtipo_recurso) {
	Tipo_recurso editar_Tiporecurso = tipo_recursoService.findById(idtipo_recurso);
	
	editar_Tiporecurso.setEnlaces(tipo_recurso.getEnlaces());
	editar_Tiporecurso.setDocumentos(tipo_recurso.getDocumentos());
	editar_Tiporecurso.setForos(tipo_recurso.getForos());
	editar_Tiporecurso.setIdsession(tipo_recurso.getIdsession());
	
	return tipo_recursoService.save(editar_Tiporecurso);
}
	@DeleteMapping("/deletetipore/{idtipo_recurso}")
	public void delete(@PathVariable Long idtipo_recurso) {
		tipo_recursoService.delete(idtipo_recurso);
	}
	}
