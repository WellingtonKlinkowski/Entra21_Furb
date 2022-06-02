package exer2;

public class P2_1 {

	public static void main(String[] args) {

		// Criando do objeto com valor atribuídos dentro do parentêses
		Conta c1 = new Conta("Wellington", 5000); 
		System.out.println("Saldo original: " + c1.getSaldo());

		 // Depositando 500 reais na conta
		c1.depositar(200);
		System.out.println("Saldo depois do dep�sito: " + c1.getSaldo());

		//Sacando um valor
		c1.sacar(300);
		System.out.println("Saldo depois do saque: " + c1.getSaldo());

	}

}
