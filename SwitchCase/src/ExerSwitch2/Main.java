package ExerSwitch2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o primeiro número e depois o segundo número:  ");
		Operacoes numeros = new Operacoes(input.nextInt(), input.nextInt());
		
		System.out.println("Escolha a operação: ");
		System.out.println("1) SOMA | 2) SUBTRAÇÃO | 3) DIVISÃO | 4) MULTIPLICAÇÃO");
		int escolha = input.nextInt();
		
		switch(escolha) {
		case 1 :
			numeros.soma(numeros.num1, numeros.num2);
			break;
			
		case 2 :
			numeros.subtracao(numeros.num1, numeros.num2);
			break;
			
		case 3 :
			numeros.divisao(numeros.num1, numeros.num2);
			break;
			
		case 4 :	
			numeros.multiplicacao(numeros.num1, numeros.num2);
			break;
			
		default :
			System.out.println("Operação inválida!");
			break;
		}
		

	}

}
