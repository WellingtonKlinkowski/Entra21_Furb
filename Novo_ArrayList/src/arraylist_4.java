import java.util.ArrayList;

public class arraylist_4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que atribua valores � Array List de acordo com o quadrado
		 * do seu �ndice. Ex: [0] = 0 [1] = 1 [2] = 4 [3] = 9
		 */

		//criando uma lista de array
		ArrayList array = new ArrayList();

		//adicionando valores quadrados do indice
		for (int i = 0; i < 10; i++) {
			array.add(i * i);
		}
		
		//printando um array completo 
		System.out.println(array);

	}

}
