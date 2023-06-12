package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.BitExistenciaInicial;

@Repository
public interface BitExistenciaInicialRepository extends JpaRepository<BitExistenciaInicial, String>{

}
