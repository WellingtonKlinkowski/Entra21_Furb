package Exercicios;

import java.util.HashMap;

public class exer3 {

	public static void main(String[] args) {
		/*
		* Crie uma classe chamada Funcionario que tenha os atributos nome, id e salário
		* Crie 5 objetos de Funcionario e coloque no Hash Map a id como chave e o nome como valor
		* Depois de colocado os 5 funcionários no Hash Map, mude o nome de um deles no mapa, sem mudar o nome do objeto em si (use o método replace)
		 */
		
		Funcionario colaborador1 = new Funcionario("Wellington", 1, 2999.56);
		Funcionario colaborador2 = new Funcionario("Mendes", 2, 999.52);
		Funcionario colaborador3 = new Funcionario("Vitor", 3, 1333.00);
		Funcionario colaborador4 = new Funcionario("Henrique", 4, 112.99);
		Funcionario colaborador5 = new Funcionario("João", 5, 487.87);
		
		HashMap<Integer, String> listagem = new HashMap<Integer, String>();
		listagem.put(colaborador1.id, colaborador1.nome);
		listagem.put(colaborador2.id, colaborador2.nome);
		listagem.put(colaborador3.id, colaborador3.nome);
		listagem.put(colaborador4.id, colaborador4.nome);
		listagem.put(colaborador5.id, colaborador5.nome);
		
		System.out.println(listagem);
		
		//Replace para alterar o valor sem alterar o armazenavel
		listagem.replace(1, "Wesley" );
		
		System.out.println(listagem);
	
	}
}
