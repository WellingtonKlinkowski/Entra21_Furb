package Exer4;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario extends Pessoa {

	double cargaHoraria;
	double salario;

	public Funcionario(String nome, String id, LocalDate ingresso, LocalDate dataNasc, Endereco endereco) {
		super(nome, id, ingresso, dataNasc, endereco);
		setCargaHoraria(cargaHoraria);
		setSalario(salario);
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		cargaHoraria = cargaHoraria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarCarga() {
		Scanner input = new Scanner(System.in);
		System.out.println("Aumentar carga horária em: 1) 1% | 2) 10% | 3) 50% | 4) 100% | 5) SAIR");
		int escolha = input.nextInt();
		if (escolha == 1) {
			this.cargaHoraria = this.cargaHoraria * 0.01;
			System.out.println("Sua carga horária aumentou: " + this.cargaHoraria);
		}
		else if (escolha == 2) {
			this.cargaHoraria = this.cargaHoraria * 0.10;
			System.out.println("Sua carga horária aumentou: " + this.cargaHoraria);
		}
		else if (escolha == 3) {
			this.cargaHoraria = this.cargaHoraria * 0.50;
			System.out.println("Sua carga horária aumentou: " + this.cargaHoraria);
		}
		else if (escolha == 4) {
			this.cargaHoraria = this.cargaHoraria * 1.00;
			System.out.println("Sua carga horária aumentou: " + this.cargaHoraria);
		}
		else {
			System.out.println("Você saiu.");
		}
	}

	public void demitir() {
		Scanner input = new Scanner(System.in);
		System.out.println("Deseja demitir? 1) SIM | 2) NÃO");
		int escolha = input.nextInt();
		
		if(escolha == 1) {
			String demitido = "Demitido";
			this.setId(demitido);
			this.salario = 0;
			System.out.println("Você demitiu " + this.getNome());
		}
	}

}
