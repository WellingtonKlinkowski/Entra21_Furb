package Exer1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Pessoa humano0 = new Pessoa("Wellington", 'M', LocalDate.of(1999, 03, 30), "Se fudendo");
		Pessoa humano1 = new Pessoa("Mendes", 'M', LocalDate.of(2005, 10, 13), "Cachorrada");
		Pessoa humano2 = new Pessoa("Beatriz", 'F', LocalDate.of(2021, 01, 28), "Casada");
		
		System.out.println(humano0.getNome());
		System.out.println(humano0.getSexo());
		System.out.println(humano0.getEstadoCivil());
		System.out.println(humano0.getNascimento() + "\n");
		
		System.out.println(humano1.getNome());
		System.out.println(humano1.getSexo());
		System.out.println(humano1.getEstadoCivil());
		System.out.println(humano1.getNascimento() + "\n");
		
		System.out.println(humano2.getNome());
		System.out.println(humano2.getSexo());
		System.out.println(humano2.getEstadoCivil());
		System.out.println(humano2.getNascimento() + "\n");

	}

}
