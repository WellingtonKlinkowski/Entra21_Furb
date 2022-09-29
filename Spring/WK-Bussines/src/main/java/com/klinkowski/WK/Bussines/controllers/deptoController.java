package com.klinkowski.WK.Bussines.controllers;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klinkowski.WK.Bussines.domain.Departamento;
import com.klinkowski.WK.Bussines.repositories.DepartamentoRepository;

@RestController
@RequestMapping(value="/departamentos")
public class deptoController {
    
    @Autowired
    private DepartamentoRepository deptoRepository;
    
    @GetMapping
    public ResponseEntity<List<Departamento>> findAll(){
        List<Departamento> departamentos = deptoRepository.findAll(); 
        return ResponseEntity.ok().body(departamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Departamento>> findById(@PathVariable Integer id){
        Optional <Departamento> departamento = deptoRepository.findById(id);
        return ResponseEntity.ok().body(departamento);
    }

}
