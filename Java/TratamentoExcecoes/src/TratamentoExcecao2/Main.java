package TratamentoExcecao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em que o usuário entra com dois números E depois ele
		 * escolhe a operação que vai ser feita com esses números
		 * 
		 * Caso ele escolha a operação 1 Some as duas variáveis
		 * 
		 * Caso ele escolha a operação 2 Subtraia as duas variáveis
		 * 
		 * Caso ele escolha a operação 3 Multiplique as duas variáveis
		 * 
		 * Caso ele escolha a operação 4 Divida as duas variáveis
		 * 
		 * Caso ele escolha algum outro número, lance uma exceção
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Entre com um número: ");
		int numb1 = input.nextInt();
		System.out.println("Entre com o segundo número: ");
		int numb2 = input.nextInt();
		System.out.println("Escolha qual operação será feita.");
		System.out.println("1)SOMA | 2)SUBTRAÇÃO | 3) MULTIPLICAÇÃO | 4) DIVISÃO");
		int escolha = input.nextInt();

		if (escolha == 1) {
			System.out.println(numb1 + numb2);
		} else if (escolha == 2) {
			System.out.println(numb1 - numb2);
		} else if (escolha == 3) {
			System.out.println(numb1 * numb2);
		} else if (escolha == 4) {
			System.out.println(numb1 / numb2);
		}
		else if (escolha >= 5){
			throw new IllegalArgumentException("Opção inválida.");
		}

	}

}
