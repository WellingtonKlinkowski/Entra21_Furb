import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_5 {

	public static void main(String[] args) {
		//Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		System.out.println("Digite um indice: ");
		int indice = input.nextInt();
		
		for(int i = 0; i <= 100; i++) {
			array.add(i * i);
		}
		
		array.set(indice, 0);
		System.out.println(array);
	}
}
