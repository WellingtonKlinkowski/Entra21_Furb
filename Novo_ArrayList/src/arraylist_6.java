import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_6 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo em que o usu�rio insere um n�mero em um �ndice espec�fico
		 * que ele mesmo informou
		 */

		Scanner input = new Scanner(System.in);

		ArrayList array = new ArrayList();

		System.out.println("Digite um indice: ");
		int indice = input.nextInt();
		System.out.println("Digite um valor para atribuir ao seu indice: ");
		int valor = input.nextInt();

		for (int i = 0; i <= 100; i++) {
			array.add(i * i);
		}

		array.set(indice, valor);
		System.out.println(array);
	}
}
