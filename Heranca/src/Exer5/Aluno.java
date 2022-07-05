package Exer5;

public class Aluno {

	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mostra() {
		System.out.println("Seu nome é " + getNome());
		System.out.println("Sua idade é " + getIdade());
	}
	
	
}
