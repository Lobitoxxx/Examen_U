package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.Devoluciones;

@Repository
public interface DevolucionesRepository extends JpaRepository<Devoluciones,String>{

}
