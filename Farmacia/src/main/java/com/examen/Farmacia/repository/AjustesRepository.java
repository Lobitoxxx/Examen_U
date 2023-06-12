package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.Ajustes;

@Repository
public interface AjustesRepository extends JpaRepository<Ajustes,String>{
	
}
