package exer2;

public class Conta {

	// Variáveis private para evitar que elas sejam acessadas diretamente
	private String nome; 
	private double saldo;

	
	// Colocando os sets no construtor
	public Conta(String nome, double saldo) {
		setNome(nome); 
		setSaldo(saldo);
	}

	public void sacar(double valor) {
		setSaldo(getSaldo() - valor);
	}

	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
	}

	public String getNome() {
		return nome;
	}

	
	// Validando o nome
	public void setNome(String nome) { 
		if (nome.isBlank() || nome == null) {
			this.nome = "Erro";

		} else {
			this.nome = nome;

		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo < -200) {
			this.saldo = 0;
		}
		else {
			this.saldo = saldo;
		}
	}

}