package com.examen.Farmacia.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Devoluciones;
@Service
public interface DevolucionesService {
	public Devoluciones registrar(Devoluciones a);
	public Devoluciones actualizar(Devoluciones a);
	public void eliminar(Devoluciones a);
	public List <Devoluciones>ver();
}
