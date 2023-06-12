package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.Compras;

@Repository
public interface ComprasRepository extends JpaRepository<Compras, String>{

}
