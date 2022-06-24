package TratamentoExcecoes5;

import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Main {

	public static void main(String[] args) throws LimitExceededException {

		/*
		 * Faça um algoritmo em que o usuário insere um número em um vetor no índice
		 * específico que ele mesmo informou. Lance as exceções que você achar
		 * necessárias
		 */
		
		Scanner input = new Scanner(System.in);
		int vetor [] = new int [1000];
		
		System.out.println("Digite o indice que deseja: ");
		int indice = input.nextInt();
		int valor = 0;
		
		if(indice > 1000) {
			throw new LimitExceededException("O limite do vetor foi atingido. Insira indices abaixo de 1000");
		}
		
		else {
			for(int i = 0; i <= 1000; i++) {
				if(indice == i) {
					System.out.println("Digite o valor que deseja inserir na posição: ");
					valor = input.nextInt();
					vetor[indice] = valor;
					System.out.println("O indice escolhido foi " + indice + " e o valor inserido nele é " + vetor[indice]);
				}
			}
			
		}

	}

}
