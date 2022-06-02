import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_7 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que leia 5 valores decimais e os coloque em uma Array List.
		 *  Em seguida, modifique a Array List de modo que os valores das POSIÇÕES ímpares sejam aumentados
		 *   em 5% e os das POSIÇÕES pares sejam aumentados em 2%. Imprima a Array List resultante
		 */
		
		ArrayList<Double> array = new ArrayList<>();
		array.add(5.5);
		array.add(39.9);
		array.add(1923.34);
		array.add(3.8);
		array.add(44.4);
		
		for(int i = 0; i <= array.size() -1; i++) {
			if(array.size() % 2 == 0) {
				array.set(i,array.get(i) + array.get(i) * 0.02);
			}
			else {
				array.set(i, array.get(i) + array.get(i) * 0.05);
			}
		}
		
		System.out.println(array);
		
	}
}
