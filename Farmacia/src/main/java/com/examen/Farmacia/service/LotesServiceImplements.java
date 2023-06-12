package com.examen.Farmacia.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Lotes;
import com.examen.Farmacia.repository.LotesRepository;


@Service
public class LotesServiceImplements implements LotesService{
	@Autowired
	LotesRepository x;

	@Override
	public Lotes registrar(Lotes a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Lotes actualizar(Lotes a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Lotes a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Lotes> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
}
