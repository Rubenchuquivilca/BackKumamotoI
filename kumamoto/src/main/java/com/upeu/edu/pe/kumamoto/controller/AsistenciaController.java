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

import com.upeu.edu.pe.kumamoto.entity.Asistencia;
import com.upeu.edu.pe.kumamoto.service.AsistenciaService;

@RequestMapping("/apisis")
@RestController
public class AsistenciaController {
	
	@Autowired
	private AsistenciaService asistenciaService;
	
	@GetMapping("/asistencia")
	public List<Asistencia> readAll(){
		return (List<Asistencia>) asistenciaService.findAll();
	}
	@GetMapping("/asistencia/{idasistencia}")
	public Asistencia read (@PathVariable Long idasistencia) {
		return asistenciaService.findById(idasistencia);
	}
	@PostMapping("/saveasis")
	@ResponseStatus(HttpStatus.CREATED)
	public Asistencia create(Asistencia asistencia) {
		return asistenciaService.save(asistencia);
	}
	@PutMapping("/editasis/{idasistencia}")
	public Asistencia update(@RequestBody Asistencia asistencia, @PathVariable Long idasistencia) {
		Asistencia editar_asistencia = asistenciaService.findById(idasistencia);
		
		editar_asistencia.setTipo_asistencia(asistencia.getTipo_asistencia());
		editar_asistencia.setInas_justificada(asistencia.getInas_justificada());
		editar_asistencia.setInas_injustificada(asistencia.getInas_injustificada());
		editar_asistencia.setTard_justificada(asistencia.getTard_justificada());
		editar_asistencia.setTard_injustificada(asistencia.getTard_injustificada());
		editar_asistencia.setFecha_asis(asistencia.getFecha_asis());
		editar_asistencia.setEstado(asistencia.getEstado());
		editar_asistencia.setIdestudiante(asistencia.getIdestudiante());
		
		return asistenciaService.save(editar_asistencia);
	}
	@DeleteMapping("/deleteasis/{idasistencia}")
	public void delete(@PathVariable Long idasistencia) {
		asistenciaService.delete(idasistencia);
	}
}
