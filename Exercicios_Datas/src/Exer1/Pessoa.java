package Exer1;

import java.time.LocalDate;

public class Pessoa {
	/*
	 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de nascimento e estado civil de uma pessoa. 
	 * O sexo deve ser definido como um caracter (‘F’ ou ‘M’).
	 *  Crie 3 objetos de Pessoa.
	 */
	
	private String nome;
	private char sexo;  //F ou M
	private LocalDate nascimento;
	private String estadoCivil;
	
	public Pessoa(String nome, char sexo, LocalDate nascimento, String estadoCivil) {
		super();
		setNome(nome);
		setSexo(sexo);
		setNascimento(nascimento);
		setEstadoCivil(estadoCivil);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	

}
