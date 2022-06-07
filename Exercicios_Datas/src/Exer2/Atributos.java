package Exer2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Atributos {

	/*
	 * Faça um programa que tenha uma classe com os atributos nome e data de
	 * nascimento, crie esses objetos dos seus colegas e os coloque em uma ArrayList
	 * Printe o dia, dia da semana, mês e ano de cada objeto Descubra o nome de quem
	 * é o mais velho e o mais novo, printe a idade deles, o dia da semana em que
	 * nasceram e a estação do ano (não existe método para estação) Descubra quantas
	 * pessoas nasceram em anos bissextos
	 */

	private String nome;
	private LocalDate dataNasc;
	static ArrayList<Atributos> amigos = new ArrayList<>();

	public Atributos() {
		setNome(nome);
		setDataNasc(dataNasc);
		amigos.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void estAno(LocalDate dataNasc) {
		int mes = dataNasc.getMonthValue();
		if (mes >= 1 && mes <= 2 || mes == 12) {
			System.out.println("Nasceu no verão");
		} else if (mes >= 3 && mes <= 5) {
			System.out.println("Nasceu no outono");
		} else if (mes >= 6 && mes <= 8) {
			System.out.println("Nasceu no inverno");
		} else if (mes >= 9 && mes <= 11) {
			System.out.println("Nasceu na primavera");
		}
	}

	public void diaSemana(LocalDate dataNasc) {
		DayOfWeek diaSemana = dataNasc.getDayOfWeek();
		System.out.println("Nasceu no dia da semana " + diaSemana);

	}

	public void anoBissexto(LocalDate dataNasc) {
		boolean bissexto = dataNasc.isLeapYear();
		if (bissexto == true) {
			System.out.println("Você nasceu em um ano bissexto");
		} else if (bissexto == false) {
			System.out.println("Você não nasceu em um ano bissexto");
		}
	}

	public void idade(LocalDate dataNasc) {
		LocalDate idade = LocalDate.now();
		int anos = dataNasc.compareTo(idade);
		anos = anos - anos - anos;
		System.out.println("Sua idade é " + anos);
	}

		
	}

