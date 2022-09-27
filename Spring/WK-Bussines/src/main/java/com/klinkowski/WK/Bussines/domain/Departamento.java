package com.klinkowski.WK.Bussines.domain;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Departamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_depto;
    
    @NotEmpty(message = "Não pode ser 'null'")
    @Length(min=3, max=250, message="Campo NM_DPTO deve ter entra 3 á 255 caracteres!")
    private String nm_depto;

    public Departamento(){

    }

    public Departamento(Integer id_depto, String nm_depto) {
        this.id_depto = id_depto;
        this.nm_depto = nm_depto;
    }
    
    public Integer getId_depto() {
        return id_depto;
    }
    public void setId_depto(Integer id_depto) {
        this.id_depto = id_depto;
    }
    public String getNm_depto() {
        return nm_depto;
    }
    public void setNm_depto(String nm_depto) {
        this.nm_depto = nm_depto;
    }

}
