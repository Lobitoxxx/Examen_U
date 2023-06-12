package com.examen.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examen.Farmacia.entity.Lotes;

@Repository
public interface LotesRepository extends JpaRepository<Lotes,String>{

}