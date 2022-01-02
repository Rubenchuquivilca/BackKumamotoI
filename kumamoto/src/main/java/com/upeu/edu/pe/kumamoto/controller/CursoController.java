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

import com.upeu.edu.pe.kumamoto.entity.Curso;
import com.upeu.edu.pe.kumamoto.service.CursoService;

@RequestMapping("/apisis")
@RestController
public class CursoController {
	 @Autowired
	 private CursoService cursoService;
	 @GetMapping("/curso")
	 public List<Curso>readAll(){
		return (List<Curso>) cursoService.findAll();
	 }
	 @GetMapping("curso/{idcursos}")
	 public Curso read (@PathVariable Long idcursos) {
		 return cursoService.findById(idcursos);
	 }
	 @PostMapping("/curso")
     @ResponseStatus(HttpStatus.CREATED)
	 public Curso create (@RequestBody Curso curso) {
		return cursoService.save(curso);
	 }
	 @PutMapping("/editar/{idcurso}")
	 public Curso update(@RequestBody Curso curso, @PathVariable Long idcursos) {
		Curso editar_curso = cursoService.findById(idcursos);
		
		editar_curso.setNombre_cur(curso.getNombre_cur());
		editar_curso.setFecha_inicio(curso.getFecha_inicio());
		editar_curso.setFecha_fin(curso.getFecha_fin());
		editar_curso.setEstado(curso.getEstado());
		editar_curso.setProgreso(curso.getProgreso());
		 		 
		 return cursoService.save(editar_curso);
	 }
	 @DeleteMapping("eliminarcurso/{idcursos}")
	 public void delete(@PathVariable Long idcursos) {
		 cursoService.delete(idcursos);
		 System.out.print("curso Borrado");
	 }
}
