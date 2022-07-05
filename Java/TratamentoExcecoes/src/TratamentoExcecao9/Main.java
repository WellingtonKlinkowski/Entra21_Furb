package TratamentoExcecao9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Notas notas = new Notas();
		System.out.println("Digite sua primeira nota: ");
		notas.setNota1(input.nextDouble());
		System.out.println("Digite sua segunda nota: ");
		notas.setNota2(input.nextDouble());
		System.out.println("Digite sua terceira nota: ");
		notas.setNota3(input.nextDouble());
		notas.media(notas.getNota1(), notas.getNota2(), notas.getNota3());
		System.out.println(notas.getMedia());
		

	}

}
