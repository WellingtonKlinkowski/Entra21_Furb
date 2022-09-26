package com.klinkowski.WK.Bussines.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class generalControllers {
    @GetMapping("/")
    public String index(){
        String frase = ("Olá Brunovski!" + "\nSeu merda" + "\nMendigor");
        String frase2 = " Meu melhor amigo";
        return frase + frase2;
    }

    @PostMapping("/")
    public String indexPost(){
        return "Agora com Post";
    }

    @GetMapping("/teste")
    public String outroIndex(){
       return "Usando URI teste";
    }

    @GetMapping("/teste/{parametro}")  
    public String comParametro(@PathVariable Integer parametro){
        return "Você passou " + (parametro.toString() + 11111)+ " com parâmetro";
    }
}
