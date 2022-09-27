package com.klinkowski.WK.Bussines;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.klinkowski.WK.Bussines.domain.Departamento;
import com.klinkowski.WK.Bussines.repositories.DepartamentoRepository;

@SpringBootApplication
public class WkBussinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WkBussinesApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DepartamentoRepository dptoRep) {
		return (args) -> {
			dptoRep.save(new Departamento(null,"Produção"));
			dptoRep.save(new Departamento(null, "Finanças"));
			//dptoRep.save(new Departamento(null, null));
			//dptoRep.save(new Departamento(null, "A"));
		};

	}

}
