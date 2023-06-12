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

import com.examen.Farmacia.entity.Compras;
import com.examen.Farmacia.service.ComprasService;

@RestController
@RequestMapping
public class ComprasController {
	@Autowired
	ComprasService x;
	
	@GetMapping("/Compras")
	public List<Compras>ver(){
		return x.ver();
	}
	
	@PostMapping("/Compras")
	public Compras registrar(@RequestBody Compras a) {
		return x.registrar(a);
	}
	
	@PutMapping("/Compras")
	public Compras actualizar(@RequestBody Compras a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/Compras")
	public  void eliminar(@RequestBody Compras a) {
		x.eliminar(a);
	}
}
