package com.examen.Farmacia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Detalle_Compra;
@Service
public interface Detalle_CompraService {
	public Detalle_Compra registrar(Detalle_Compra a);
	public Detalle_Compra actualizar(Detalle_Compra a);
	public void eliminar(Detalle_Compra a);
	public List<Detalle_Compra> ver();
}
