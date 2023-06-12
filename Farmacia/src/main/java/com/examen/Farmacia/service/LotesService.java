package com.examen.Farmacia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Lotes;
@Service
public interface LotesService {
	public Lotes registrar(Lotes a);
	public Lotes actualizar(Lotes a);
	public void eliminar(Lotes a);
	public List <Lotes>ver();
}
