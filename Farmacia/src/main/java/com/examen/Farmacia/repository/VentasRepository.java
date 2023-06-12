package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.Ventas;

@Repository
public interface VentasRepository extends JpaRepository<Ventas,String>{

}
