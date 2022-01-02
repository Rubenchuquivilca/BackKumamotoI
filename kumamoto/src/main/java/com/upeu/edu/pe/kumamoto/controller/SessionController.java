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

import com.upeu.edu.pe.kumamoto.entity.Session;
import com.upeu.edu.pe.kumamoto.service.SessionService;

@RequestMapping("/apisis")
@RestController
public class SessionController {

	@Autowired
	private SessionService sessionService;
	
	@GetMapping("/session")
	public List<Session> readAll(){
		return (List<Session>) sessionService.findAll();
	}
	@GetMapping("/session/{idsession}")
	public Session read (@PathVariable Long idsession) { 
		return sessionService.findById(idsession);
	}
	@PostMapping("/savesess")
	@ResponseStatus(HttpStatus.CREATED)
	public Session create(Session session) {
		return sessionService.save(session);
	}
	@PutMapping("/editsess/{idsession}")
	public Session update (@RequestBody Session session, @PathVariable Long idsession) {
		Session editar_session = sessionService.findById(idsession);
		
		editar_session.setNom_seccion(session.getNom_seccion());
		editar_session.setDescripcion(session.getDescripcion());
		editar_session.setFecha_ini(session.getFecha_ini());
		editar_session.setFecha_fin(session.getFecha_fin());
		editar_session.setIdunidad(session.getIdunidad());
		
		return sessionService.save(editar_session);
	}
	@DeleteMapping("/deletesess/{idsession}")
	public void delete(@PathVariable Long idsession) {
		sessionService.delete(idsession);
	}
}
