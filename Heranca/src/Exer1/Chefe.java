package Exer1;

public class Chefe extends Trabalhador{

	int qtdSubordinado;

	public Chefe(int qtdSubordinado) {

		this.qtdSubordinado = qtdSubordinado;
	}

	public int getQtdSubordinado() {
		return qtdSubordinado;
	}

	public void setQtdSubordinado(int qtdSubordinado) {
		this.qtdSubordinado = qtdSubordinado;
	}
	
	public void dobrarSoldo(){
		this.setSalario ( getSalario() * 2);
	}
	
}
