package TratamentoExcecao7;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

import javax.naming.LimitExceededException;

public class Funcionario {
	/*
	*Crie uma classe de Funcionario que tenha os atributos:
	*nome, id, salário, data de nascimento, endereço (UF, cidade, Nº da casa, rua e CEP)
	*UF deve ter obrigatoriamente dois caracteres e CEP deve ter obrigatoriamente 8 números
	*
	*Crie 5 objetos de Funcionario e coloque no Hash Map a id como chave e o nome como valor
	*
	*Lance exceções nos métodos sets de Funcionário e Endereço
	 */
	
	String nome;
	String id;
	double salario;
	LocalDate dataNasc;
	Endereco endereco;
	
	public Funcionario(String nome, String id, double salario, LocalDate dataNasc, Endereco endereco) {
		super();
		this.nome = nome;
		this.id = id;
		this.salario = salario;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) throws Throwable {
		if(id.length() != 2) {
			throw new LimitExceededException("UF é apenas as duas primeiras letras do seu estado.");
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) throws Exception {
		this.dataNasc = dataNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
