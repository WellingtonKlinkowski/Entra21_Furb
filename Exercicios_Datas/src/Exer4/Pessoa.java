package Exer4;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private String id;
	private LocalDate ingresso;
	private LocalDate dataNasc;
	private Endereco endereco;
	public Pessoa(String nome, String id, LocalDate ingresso, LocalDate dataNasc, Endereco endereco) {
		setNome(nome);
		setId(id);
		setIngresso(ingresso);
		setDataNasc(dataNasc);
		setEndereco(endereco);
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
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getIngresso() {
		return ingresso;
	}
	public void setIngresso(LocalDate ingresso) {
		this.ingresso = ingresso;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
		
	}
	
	
	}
