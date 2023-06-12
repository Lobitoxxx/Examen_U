package com.examen.Farmacia.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Farmacia.entity.Estado_Ventas;
import com.examen.Farmacia.repository.Estado_VentasRepository;

@Service
public class Estado_VentasServiceImplements implements Estado_VentasService{
	@Autowired
	Estado_VentasRepository x;

	@Override
	public Estado_Ventas registrar(Estado_Ventas a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Estado_Ventas actualizar(Estado_Ventas a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Estado_Ventas a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Estado_Ventas> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
}