package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.Detalle_lote;

@Repository
public interface Detalle_loteRepository extends JpaRepository<Detalle_lote,String>{

}
