package Exercicios;

import java.util.HashMap;
import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		/*
		 * Crie um Hash Map que receba uma entrada do usu�rio. 
		 * Se o n�mero de entrada do usu�rio for par, coloque "Par" no valor e o n�mero de entrada como chave.
		 *  Se for impar, coloque "Impar" como valor e o n�mero como chave.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor para saber se � par ou impar: ");
		int datEntr = input.nextInt();

		HashMap<Integer, String> listagem = new HashMap<Integer, String>();
		
		if(datEntr % 2 == 0) {
			listagem.put(datEntr, "Par");
		}
		else {
			listagem.put(datEntr, "lmpar");
		}
		
		System.out.println(listagem);
		
	}

}
