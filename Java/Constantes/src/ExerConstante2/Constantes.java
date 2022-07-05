package ExerConstante2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Constantes {
	
	LocalDate data;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	
	public enum Meses {
		JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4), MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9), OUTUBRO(10),
		NOVEMBRO(11), DEZEMBRO(12);

		final int numero;

		private Meses(int numero) {
			this.numero = numero;
		}
	}

	public enum DiasSemana {
		DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

		final int numDaysOfWeek;

		private DiasSemana(int numDaysOfWeek) {
			this.numDaysOfWeek = numDaysOfWeek;
		}
	}

	public void findSemana() {

		boolean finalSemana = false;

		if (data.getDayOfWeek().equals(DayOfWeek.SUNDAY) || data.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			finalSemana = true;
			System.out.println("É final de semana: " + finalSemana);
		} else {
			finalSemana = false;
			System.out.println("É final de semana: " + finalSemana);
		}

	}

	public void diaDaSemana() {

		boolean diaDaSemana = false;

		if (!data.getDayOfWeek().equals(DayOfWeek.SUNDAY) && !data.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			diaDaSemana = true;
			System.out.println("É dia de semana: " + diaDaSemana);
		} else {
			diaDaSemana = false;
			System.out.println("É dia de semana: " + diaDaSemana);
		}

	}
}
