package TratamentoExcecao6;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Main {

	public static void main(String[] args) throws LimitExceededException {
		/*
		 * Faça um algoritmo em que o usuário insere um número em uma Array List no
		 * índice específico que ele mesmo informou. O valor original daquele índice
		 * deve ser substituído pelo valor novo. Lance as exceções que você achar
		 * necessárias
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();

		
		System.out.println("Insira um indice e um valor para alocar: ");
		int indice = input.nextInt();
		int valor = input.nextInt();
		
		if(indice > 100) {
			throw new LimitExceededException("O array só vai até 100");
		}
		else if(valor > 100000) {
			throw new LimitExceededException("Alto demais para ser reservado aqui");
		}
		
		for(int i = 0; i <= 100; i++) {
			if(indice == i) {
				array.add(indice, valor);

			}
			else {
				array.add(i, i * i);
			}
		}
		System.out.println(array);
		

	}

}
