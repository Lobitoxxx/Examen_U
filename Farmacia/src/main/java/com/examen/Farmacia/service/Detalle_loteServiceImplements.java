package com.examen.Farmacia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Detalle_lote;
import com.examen.Farmacia.repository.Detalle_loteRepository;

@Service
public class Detalle_loteServiceImplements implements Detalle_loteService{
	@Autowired
	Detalle_loteRepository x;
	@Override
	public Detalle_lote registrar(Detalle_lote a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Detalle_lote actualizar(Detalle_lote a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Detalle_lote a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Detalle_lote> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}