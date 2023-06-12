package com.examen.Farmacia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Compras;
@Service
public interface ComprasService {
	public Compras registrar(Compras a);
	public Compras actualizar(Compras a);
	public void eliminar(Compras a);
	public List<Compras> ver();
}
