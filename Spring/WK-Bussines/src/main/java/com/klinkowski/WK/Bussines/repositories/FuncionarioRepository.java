package com.klinkowski.WK.Bussines.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.klinkowski.WK.Bussines.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
    
    @Query("SELECT f_objeto FROM Funcionario f_objeto WHERE f_objeto.departamento.id = :pIdDepto ORDER BY nm_funcionario")
    List<Funcionario> findAllByDepto(@Param(value="pIdDepto")Integer pIdDepto);

}
