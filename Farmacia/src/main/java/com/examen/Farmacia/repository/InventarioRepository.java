package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario,String>{

}
