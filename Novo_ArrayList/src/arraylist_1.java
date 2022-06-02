import java.util.ArrayList;

public class arraylist_1 {

	public static void main(String[] args) {
		//Crie uma Array List e printe os últimos elementos por primeiro
		
		
		//Um array criado com a tecla espaço com o nome de "lista"
		ArrayList lista = new ArrayList();
		//adicionado valores as posições da lista. (0, 1, 2)
		lista.add(3);
		lista.add(2);
		lista.add(1);
		
		//Um for que recebe o tamanho da lista, com padrões (-1) para não dar erro de index
		for(int i = lista.size() -1; i > -1; i--) {
			//lista.get é usado para imprimir o array e o "i" é a posição impressa
			System.out.println(lista.get(i));
		}
		
	}

}
