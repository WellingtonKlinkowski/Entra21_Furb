package Exer5;

public class AlunoEnsinoMedio extends Aluno {

	private int ano;

	public AlunoEnsinoMedio(int ano, String nome, int idade) {
		super(nome, idade);
		setAno(ano);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void mostra() {
		super.mostra();
		System.out.println("O ano é " + getAno());
	}
	
}
