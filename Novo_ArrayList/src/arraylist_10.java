import java.util.ArrayList;

public class arraylist_10 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler os valores de duas Array Lists.
		 * Crie uma terceira Array List em que cada elemento é a soma dos valores contidos nas posições respectivas das Array Lists originais.
		 * Por exemplo, Array List = [1,2,3] 
		 * 						Array List = [1,5,6] 
		 * 						Array List = [2,7,9]. 
		 * Exiba, ao final, as três Array Lists na tela.
		 */
		
		ArrayList<Integer>array1 = new ArrayList<>();
		array1.add(3);
		array1.add(6);
		array1.add(9);
		
		ArrayList<Integer>array2 = new ArrayList<>();
		array2.add(9);
		array2.add(6);
		array2.add(3);
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(array1.get(0) + array2.get(0));
		array.add(array1.get(1) + array2.get(1));
		array.add(array1.get(2) + array2.get(2));
		
		

		System.out.println(array1 + "\n + \n" + array2 + "\n = \n" + array);
	}

}
