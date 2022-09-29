package com.klinkowski.WK.Bussines;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.klinkowski.WK.Bussines.domain.Departamento;
import com.klinkowski.WK.Bussines.domain.Funcionario;
import com.klinkowski.WK.Bussines.repositories.DepartamentoRepository;
import com.klinkowski.WK.Bussines.repositories.FuncionarioRepository;

@SpringBootApplication
public class WkBussinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WkBussinesApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DepartamentoRepository dptoRep, 
	FuncionarioRepository funcRep) {
		return (args) -> {
			Departamento depto1 = new Departamento(null,"Produção");
			Departamento depto2 = new Departamento(null, "Finanças");
			dptoRep.save(depto1);
			dptoRep.save(depto2);
			funcRep.save(new Funcionario(null, "Wellington", depto1));
			funcRep.save(new Funcionario(null, "Bruno", depto2));
			funcRep.save(new Funcionario(null, "Julio", depto1));
			funcRep.save(new Funcionario(null, "Yuri", depto2));
		};

	}

}
