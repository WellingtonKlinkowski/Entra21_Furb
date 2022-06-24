import java.util.ArrayList;

public class arraylist_1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Crie uma Array List e printe os �ltimos elementos por primeiro
		
		
		//Um array criado com a tecla espa�o com o nome de "lista"
		@SuppressWarnings("rawtypes")
		ArrayList lista = new ArrayList();
		//adicionado valores as posi��es da lista. (0, 1, 2)
		lista.add(3);
		lista.add(2);
		lista.add(1);
		
		//Um for que recebe o tamanho da lista, com padr�es (-1) para n�o dar erro de index
		for(int i = lista.size() -1; i > -1; i--) {
			//lista.get � usado para imprimir o array e o "i" � a posi��o impressa
			System.out.println(lista.get(i));
		}
		
	}

}
