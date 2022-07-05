import java.util.ArrayList;

public class arraylist_9 {

	public static void main(String[] args) {
		//Descreva um algoritmo que leia 6 valores reais e os coloque em uma Array List.
		//Imprima quais valores desses informados são maiores que a média dos valores.
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(39);
		array.add(67);
		array.add(140);
		array.add(9);
		array.add(1);
		array.add(100);
		
		int media = 0;
		int contador = 0;
		
		for(int i = 0; i < array.size() - 1; i++ ) {
			media += array.get(i);
			contador++;
		}
		
		media = media / contador;
		System.out.println("A media é " + media);
		
		for( int j = 0; j <= contador; j++) {
			if( array.get(j) > media) {
				System.out.println(array.get(j));
			}
		}

	}

}
