package TratamentoExcecao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em que o usuário entre com 2 valores de 1 a 100 E depois
		 * mostre a divisão entre eles Caso o usuário entre com o valor 0, lance uma
		 * exceção explicando que está sendo feita uma divisão por 0 Caso o usuário
		 * entre com algum outro número, lance uma exceção explicando que o número está
		 * fora dos limites
		 */
		
		Scanner input = new Scanner(System.in);
		
		
		//Entrando com um valor
		System.out.println("Entre com um valor de 0 até 100: ");
		int numb1 = input.nextInt();
		
		//Condição para verificar se o número está nos padrões desejados.
		if(numb1 < 0 || numb1 > 100) {
			if(numb1 <= 0) {
				throw new IllegalArgumentException("Valor inválido. O valor será divido e 0 não se encaixa nos padrões determinados para a aplicação.");
			}
			else if(numb1 > 100) {
				throw new IllegalArgumentException("Valor fora dos limites da aplicação.");
			}
		}
		
		//Entrando com um valor
		System.out.println("Entre com outro valor de 0 até 100: ");
		int numb2 = input.nextInt();
		
		//Condição para verificar se o número está nos padrões desejados.
		if(numb2 < 0 || numb2 > 100) {
			if(numb2 <= 0) {
				throw new IllegalArgumentException("Valor inválido. O valor será divido e 0 não se encaixa nos padrões determinados para a aplicação.");
			}
			else if(numb2 > 100) {
				throw new IllegalArgumentException("Valor fora dos limites da aplicação.");
			}
		}
		
		//Caso nada conste ele irá imprimir a operação.
		else {
			System.out.println(numb1 / numb2);
		}
		

	}

}
