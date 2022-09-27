package com.klinkowski.WK.Bussines.domain;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_funcionario;
    @NotEmpty
    @Length(min=3, max = 255, message = "Não pode ser vazio!")
    private String nm_funcionario;

}
