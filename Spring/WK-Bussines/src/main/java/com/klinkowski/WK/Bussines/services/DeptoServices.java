package com.klinkowski.WK.Bussines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.klinkowski.WK.Bussines.repositories.DepartamentoRepository;

@Service
public class DeptoServices {
    
    @Autowired
    DepartamentoRepository dRepository;

    public void delDepartamento(Integer pId){
        try{
            dRepository.deleteById(pId);
        }catch(org.springframework.dao.DataIntegrityViolationException e){
            throw new DataIntegrityViolationException("Departamento possui afiliados pendentes. Remova ou altere o setor.");
        }
    }

}
