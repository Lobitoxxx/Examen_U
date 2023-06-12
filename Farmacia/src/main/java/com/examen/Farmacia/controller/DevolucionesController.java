package com.examen.Farmacia.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.Farmacia.entity.Devoluciones;
import com.examen.Farmacia.service.DevolucionesService;

@RestController
@RequestMapping
public class DevolucionesController {
	@Autowired
	DevolucionesService x;
	
	@GetMapping("/Devoluciones")
	public List<Devoluciones>ver(){
		return x.ver();
	}
	
	@PostMapping("/Devoluciones")
	public Devoluciones registrar(@RequestBody Devoluciones a) {
		return x.registrar(a);
	}
	
	@PutMapping("/Devoluciones")
	public Devoluciones actualizar(@RequestBody Devoluciones a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/Devoluciones")
	public  void eliminar(@RequestBody Devoluciones a) {
		x.eliminar(a);
	}
}