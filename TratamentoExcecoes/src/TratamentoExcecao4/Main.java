package TratamentoExcecao4;

import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Main {

	public static void main(String[] args) throws LimitExceededException {
		/*
		 * Еscreva um algoritmo que leia a altura de 5 pessoas e calcule a média de
		 * altura das mesmas. Lance as exceções que você achar necessárias
		 */
		
		Scanner input = new Scanner(System.in);
		
		double alturas = 0;
		double media = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite sua altura;");
			alturas = input.nextDouble();
			if(alturas > 2.30) {
				throw new LimitExceededException("Não há registros de pessoas com está altura.");
			}
			if(alturas < 0.10) {
				throw new LimitExceededException("Sem registro de pessoas com está altura.");
			}
			media += alturas;
		}
		System.out.println(media / 5);

	}

}
