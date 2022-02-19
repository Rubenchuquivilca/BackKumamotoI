package com.upeu.edu.pe.kumamoto.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.upeu.edu.pe.kumamoto.entity.Nota;
import com.upeu.edu.pe.kumamoto.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.edu.pe.kumamoto.entity.Estudiante;
import com.upeu.edu.pe.kumamoto.service.EstudianteService;

@RequestMapping("/apisis")
@RestController
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;

	@Autowired
	private NotaService notaService;
	
	@GetMapping("/estudiante")
	public List<Estudiante> readAll(){ 
		return (List<Estudiante>) estudianteService.findAll();
	}
	@GetMapping("/estudiante/{idestudiante}")
	public Estudiante read (@PathVariable Long idestudiante) {
		return estudianteService.findById(idestudiante);
	}
	@PostMapping("/saveest")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante create(Estudiante estudiante) {
		return estudianteService.save(estudiante);
	}
	@PutMapping("/editest/{idestudiante}")
	public Estudiante update (@RequestBody Estudiante estudiante, @PathVariable Long idestudiante) {
		Estudiante editar_estudiante = estudianteService.findById(idestudiante);
		
		editar_estudiante.setCodigo_estu(estudiante.getCodigo_estu());
		editar_estudiante.setNombre(estudiante.getNombre());
		editar_estudiante.setApellido(estudiante.getApellido());
		editar_estudiante.setDireccion(estudiante.getDireccion());
		editar_estudiante.setCelular(estudiante.getCelular());
		editar_estudiante.setFecha_nac(estudiante.getFecha_nac());;
		editar_estudiante.setDescripcion(estudiante.getDescripcion());
		
		return estudianteService.save(editar_estudiante);
	}
	@DeleteMapping("/deleteest/{idestudiante}")
	public void delete(@PathVariable Long idestudiante) {
		estudianteService.delete(idestudiante);
	}

	@GetMapping("/get-all-estudiantes-by-curso/{idCurso}")
	public ResponseEntity<?> getEstudiantesByCurso(@PathVariable Long idCurso) {

		Map<String, Object> responses 		= new HashMap<String, Object>( 10 );
		List<Estudiante> estudiantesByCurso = new ArrayList<Estudiante>(10);

		List<Nota> allNotasByCurso 	 		= null;

		try {

			allNotasByCurso = notaService.getNotasByCurso( idCurso );

		} catch (DataAccessException exception) {

			responses.put("message", "Error de consulta");
			responses.put("error", exception.getMessage() + ": " +  exception.getMostSpecificCause().getMessage() );

			return new ResponseEntity<Map<String, Object>>(responses, HttpStatus.INTERNAL_SERVER_ERROR);

		}

		if ( allNotasByCurso != null ) {

			allNotasByCurso.forEach( ( x ) -> {

				Estudiante estudiante = estudianteService.findById(x.getIdestudiante().getIdestudiante());

				estudiantesByCurso.add(estudiante);

			});

		}

		responses.put("message", "Estudiantes obteneidos de manera correcta!");
		responses.put("estudiantes", estudiantesByCurso);

		return new ResponseEntity<Map<String, Object>>(responses, HttpStatus.OK);
		
	}
}
