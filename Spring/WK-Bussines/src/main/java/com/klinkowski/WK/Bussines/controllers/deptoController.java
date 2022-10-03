package com.klinkowski.WK.Bussines.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.klinkowski.WK.Bussines.domain.Departamento;
import com.klinkowski.WK.Bussines.domain.Funcionario;
import com.klinkowski.WK.Bussines.repositories.DepartamentoRepository;
import com.klinkowski.WK.Bussines.repositories.FuncionarioRepository;
import com.klinkowski.WK.Bussines.services.DeptoServices;
import com.klinkowski.WK.Bussines.services.ObjectNotFound;

import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping(value="/departamentos")
public class deptoController {
    
    @Autowired
    private FuncionarioRepository fRepository;

    @Autowired
    private DepartamentoRepository deptoRepository;
    
    @Autowired
    private DeptoServices dServices;

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

    @PostMapping
    public ResponseEntity <Departamento> insertDepto(@Valid @RequestBody Departamento pDepartamento) {
        pDepartamento.setId_depto(null);
        deptoRepository.save(pDepartamento);
        URI vUri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(pDepartamento.getId_depto()).toUri();
        return ResponseEntity.created(vUri).body(pDepartamento);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void> delDepartamento(@PathVariable Integer id){
        dServices.delDepartamento(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Departamento> updateDepto(@Valid @PathVariable Integer id, @RequestBody Departamento pDepto) {
       Departamento atualDepto = deptoRepository.findById(id).orElseThrow(
            () -> new ObjectNotFound("Departamento não encontrado!")
        );
        atualDepto.setNm_depto(pDepto.getNm_depto());
        deptoRepository.save(atualDepto);
        return ResponseEntity.ok().body(atualDepto);
    }

    @GetMapping(value = "/{id}/funcionario")
    public ResponseEntity<List<Funcionario>> findAllByDepto(@PathVariable Integer id){
        return ResponseEntity.ok().body(fRepository.findAllByDepto(id));
    }
}
