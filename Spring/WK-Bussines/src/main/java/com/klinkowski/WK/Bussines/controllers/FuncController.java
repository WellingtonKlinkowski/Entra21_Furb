package com.klinkowski.WK.Bussines.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klinkowski.WK.Bussines.domain.Funcionario;
import com.klinkowski.WK.Bussines.services.FuncServices;

@RestController
@RequestMapping(value="/funcionarios")
public class FuncController {
    
    @Autowired
    private FuncServices fServices;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll(){
        List<Funcionario> funcionarios = fServices.findAll();
        return ResponseEntity.ok().body(funcionarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Integer id){
        Funcionario funcionario = fServices.findById(id);
        return ResponseEntity.ok().body(funcionario);
    }
}
