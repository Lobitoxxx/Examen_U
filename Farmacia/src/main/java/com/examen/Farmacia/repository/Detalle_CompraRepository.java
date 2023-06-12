package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.Detalle_Compra;

@Repository
public interface Detalle_CompraRepository extends JpaRepository<Detalle_Compra,String>{

}
