package Exer4;

import java.time.LocalDate;

public class Aluno extends Pessoa{

	private int ano;
	private LocalDate formatura;
	
	public Aluno(String nome, String id, LocalDate ingresso, LocalDate dataNasc, Endereco endereco, int ano,
			LocalDate formatura) {
		
		super(nome, id, ingresso, dataNasc, endereco);
		setAno(ano);
		setFormatura(formatura, formatura);
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public LocalDate getFormatura() {
		return formatura;
	}
	public void setFormatura(LocalDate formatura, LocalDate dataNasc) {
		this.formatura = dataNasc.plusYears(18);
		System.out.println("Sua formatura é " + getFormatura());
		
	}
	
	public void sair() {
		this.ano = 0;
		System.out.println("Você saiu! ");
	}
	
}
