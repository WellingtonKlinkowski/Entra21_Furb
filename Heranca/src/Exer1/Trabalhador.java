package Exer1;

public class Trabalhador{

	private String nome;
	private double salario;
	private int dataIngresso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(int dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	public void demitir() {
		this.salario = 0;
		System.out.println("Seu salário é " + salario + ";");
		System.out.println("Colaborador desligou-se do time.");
	}
	
}
