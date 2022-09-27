package com.klinkowski.WK.Bussines.repositories;

import org.springframework.stereotype.Repository;

import com.klinkowski.WK.Bussines.domain.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
    
}
