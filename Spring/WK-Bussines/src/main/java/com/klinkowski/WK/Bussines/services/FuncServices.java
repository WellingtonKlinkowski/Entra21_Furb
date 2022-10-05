package com.klinkowski.WK.Bussines.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klinkowski.WK.Bussines.domain.Departamento;
import com.klinkowski.WK.Bussines.domain.Funcionario;
import com.klinkowski.WK.Bussines.repositories.DepartamentoRepository;
import com.klinkowski.WK.Bussines.repositories.FuncionarioRepository;

@Service
public class FuncServices {

    @Autowired
    private FuncionarioRepository fRepository;

    @Autowired
    private DepartamentoRepository dRepository;
    
    public List<Funcionario> findAll(){
        return fRepository.findAll();
    }

    public Funcionario findById(Integer id){
        Optional<Funcionario> funcionario = fRepository.findById(id);
        return funcionario.orElseThrow(
            () -> new ObjectNotFound("Número ou objeto inválido" + id + ", Tipo: " + Funcionario.class.getName())
            );
    }

    public Funcionario insFunc(Funcionario pFuncionario, Integer pIdDepto){
        Departamento deptoFunc = 
        dRepository.findById(pIdDepto)
        .orElseThrow(
            () -> new ObjectNotFound("Departamento " + pIdDepto+ " não encontrado")
        );
        pFuncionario.setId_funcionario(null);
        pFuncionario.setDepartamento(deptoFunc);
        return fRepository.save(pFuncionario);
    }

    public void delFunc (Integer pId){
        try {
            fRepository.deleteById(pId);
        } catch (org.springframework.dao.EmptyResultDataAccessException e) {
           throw new com.klinkowski.WK.Bussines.exceptions.EmptyResultDataAccessException(
            "Funcionário " + pId + " não existe!");
        }
    }

    public Funcionario updFunc(Integer pId, Funcionario pFuncionario){
        Funcionario funcAtual =
        fRepository
        .findById(pId)
        .orElseThrow(
            () -> new ObjectNotFound("Funcionario " + pId + " não encontrado!")
        );
        funcAtual.setNm_funcionario(pFuncionario.getNm_funcionario());
        return fRepository.save(funcAtual);
    }

}
