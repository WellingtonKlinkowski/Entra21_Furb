package Exercicios;

import java.util.HashMap;

public class exer1 {

	public static void main(String[] args) {

		/*
		 * HashMap � usado senhar, pois armazena embaralhado e aprensenta em ordem.
		 * N�mero 1 � o indice que coloquei, e o nome da pessoa que est� neste indice
		 */
		
		HashMap<Integer, String> lista = new HashMap<Integer, String>();
		lista.put(6, " Wellington");
		lista.put(9, " Mendes");
		lista.put(1, " Vitor");

		System.out.println(lista);
	}

}
