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

import com.upeu.edu.pe.kumamoto.entity.Notas_periodo;
import com.upeu.edu.pe.kumamoto.service.Notas_periodoService;

@RequestMapping("/apisis")
@RestController
public class Notas_periodoController {
	 
	@Autowired
	private Notas_periodoService notas_periodoService;
	
	@GetMapping("/notas_periodo")
	public List<Notas_periodo> readAll(){
		return (List<Notas_periodo>) notas_periodoService.findAll();
	}
	@GetMapping("/notas_periodo/{idnotas_periodo}")
	public Notas_periodo read(@PathVariable Long idnotas_periodo) {
	return notas_periodoService.findById(idnotas_periodo);
}
	
	@PostMapping("/savenoperi")
	@ResponseStatus(HttpStatus.CREATED)
	public Notas_periodo create(Notas_periodo notas_periodo) {
		return notas_periodoService.save(notas_periodo);
	}
	@PutMapping("/editnope/{idnotas_periodo}")
	public Notas_periodo update (@RequestBody Notas_periodo notas_periodo, @PathVariable Long idnotas_periodo) {
		Notas_periodo editar_Notas_periodo = notas_periodoService.findById(idnotas_periodo);
		
		editar_Notas_periodo.setNom_periodo(notas_periodo.getNom_periodo());;
		
		return notas_periodoService.save(editar_Notas_periodo);
	}
	@DeleteMapping("/deletenoper/{idnotas_periodo}")
	public void delete(@PathVariable Long idnotas_periodo) {
		notas_periodoService.delete(idnotas_periodo);
		System.out.print("eliminado");
	}
}
