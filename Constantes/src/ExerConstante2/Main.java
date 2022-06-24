package ExerConstante2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Constantes data = new Constantes();		
		System.out.println("Digite o ano: ");
		int ano = input.nextInt();
		System.out.println("Digite o mês: ");
		int mes = input.nextInt();
		System.out.println("Digite o dia: ");
		int dia = input.nextInt();
		
		data.data = LocalDate.of(ano, mes, dia);
		System.out.println("\n" + data.getData());
		
		data.findSemana();
		data.diaDaSemana();
		
		
		
		
		
	}

}
