package com.examen.Farmacia.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Compras;
import com.examen.Farmacia.repository.ComprasRepository;


@Service
public class ComprasServiceImplements implements ComprasService{
	@Autowired
	ComprasRepository x;

	@Override
	public Compras registrar(Compras a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Compras actualizar(Compras a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Compras a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Compras> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
	
}