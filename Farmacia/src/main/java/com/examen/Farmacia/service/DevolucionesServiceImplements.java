package com.examen.Farmacia.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Devoluciones;
import com.examen.Farmacia.repository.DevolucionesRepository;
@Service
public class DevolucionesServiceImplements implements DevolucionesService{
	DevolucionesRepository x;

	@Override
	public Devoluciones registrar(Devoluciones a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Devoluciones actualizar(Devoluciones a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Devoluciones a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Devoluciones> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
}
