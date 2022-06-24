package TratamentoExcecao1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Leia uma data (dia, mês e ano) e determine se ela é válida. Ou seja,
		 * verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. Note que
		 * em anos bissextos Fevereiro tem 29 dias. Depois de checar que essa data está
		 * certa, coloque em um LocalDate Caso a data não seja válida, lance uma exceção
		 */
		Scanner input = new Scanner(System.in);

		LocalDate data;

		try {
			System.out.println("Digite uma data qualquer no formato AAAA MM DD: ");
			data = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
		} catch (DateTimeException e) {

			throw new DateTimeException("Fevereiro só tem 29 dias");
		}
	}

}
