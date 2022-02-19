package com.upeu.edu.pe.kumamoto.controller;

import java.util.List;

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

import com.upeu.edu.pe.kumamoto.entity.Docente;
import com.upeu.edu.pe.kumamoto.service.DocenteService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apisis")
@RestController
public class DocenteController {
	
	@Autowired
	private DocenteService docenteService;

	@GetMapping("/docente")
	public List<Docente>readAll(){
		return(List<Docente>) docenteService.findAll();
	}

	@GetMapping("docente/{iddocente}")
	public Docente read (@PathVariable Long iddocente) {
		return docenteService.findById(iddocente);
	}

	@PostMapping("/docente")
    @ResponseStatus(HttpStatus.CREATED)
	public Docente create(@RequestBody Docente docente) {
		return docenteService.save(docente);
	}

	@PutMapping("/editar/{iddocente}")
	public Docente update(@RequestBody Docente docente, @RequestBody Long iddocente) {
		Docente editar_docente = docenteService.findById(iddocente);
		
		editar_docente.setNombre(docente.getNombre());
		editar_docente.setApellido(docente.getApellido());
		editar_docente.setDni(docente.getDni());
		editar_docente.setCorreo(docente.getCorreo());
		editar_docente.setDireccion(docente.getDireccion());
		editar_docente.setCelular(docente.getCelular());
		editar_docente.setDescripcion(docente.getDescripcion());
		
		return docenteService.save(editar_docente);
	}
	@DeleteMapping("eliminardocente/{iddocente}")
	public void delete(@PathVariable Long iddocente) {
		docenteService.delete(iddocente);
		System.out.print("curso Borrado");
	}
}
