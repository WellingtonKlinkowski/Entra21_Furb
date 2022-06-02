import java.util.ArrayList;

public class arraylist_2 {

	public static void main(String[] args) {
		//Coloque 5 elementos em uma Array List e ordene-os
		
		//array criado com ajuda da IDE (tecla espaço)
		ArrayList array = new ArrayList();
		
		//adicionando valores ao array
		array.add(2);
		array.add(4);
		array.add(3);
		array.add(5);
		array.add(1);
		
		//array.sorte(null) irá ordenar os valores por valor inserido, ele vem da biblioteca importada na IDE
		array.sort(null);
		//printando os valores dentro do array usando o "sort"
		System.out.println(array);

	}

}
