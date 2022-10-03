package com.klinkowski.WK.Bussines.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_funcionario;
    @NotEmpty(message ="Campo nome do funcionário não pdoe ser vazio")
    @Length(min=3, max = 255, message = "Deve ter 3 a 255 letras!")
    private String nm_funcionario;

    @ManyToOne
    @JoinColumn(name = "id_depto")
    private Departamento departamento;

    public Funcionario(Integer id_funcionario, String nm_funcionario, Departamento departamento) {
        this.id_funcionario= id_funcionario;
        this.nm_funcionario = nm_funcionario;
        this.departamento = departamento;
    }

    public Funcionario() {
    }

    public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNm_funcionario() {
        return nm_funcionario;
    }

    public void setNm_funcionario(String nm_funcionario) {
        this.nm_funcionario = nm_funcionario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    



}
