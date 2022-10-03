package com.klinkowski.WK.Bussines.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klinkowski.WK.Bussines.domain.Funcionario;
import com.klinkowski.WK.Bussines.repositories.FuncionarioRepository;

@Service
public class FuncServices {

    @Autowired
    private FuncionarioRepository fRepository;
    
    public List<Funcionario> findAll(){
        return fRepository.findAll();
    }

    public Funcionario findById(Integer id){
        Optional<Funcionario> funcionario = fRepository.findById(id);
        return funcionario.orElseThrow(
            () -> new ObjectNotFound("Número ou objeto inválido" + id + ", Tipo: " + Funcionario.class.getName())
            );
    }

}
