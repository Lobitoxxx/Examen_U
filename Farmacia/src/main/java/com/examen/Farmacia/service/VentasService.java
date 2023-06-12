package com.examen.Farmacia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Ventas;
@Service
public interface VentasService {
	public Ventas registrar(Ventas a);
	public Ventas actualizar(Ventas a);
	public void eliminar(Ventas a);
	public List <Ventas>ver();
}
