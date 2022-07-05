package TratamentoExcecao7;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		/*
		*Crie uma classe de Funcionario que tenha os atributos:
		*nome, id, salário, data de nascimento, endereço (UF, cidade, Nº da casa, rua e CEP)
		*UF deve ter obrigatoriamente dois caracteres e CEP deve ter obrigatoriamente 8 números
		*
		*Crie 5 objetos de Funcionario e coloque no Hash Map a id como chave e o nome como valor
		*
		*Lance exceções nos métodos sets de Funcionário e Endereço
		 */
		
		Funcionario colab1 = new Funcionario("Wellington", "10", 2800.00, LocalDate.of(1999, 02, 28), null);
		Endereco doUm = new Endereco("SC", "Blumenau", 3082, "Rua professor jacob ineichen", "89066600");
		colab1.endereco = doUm;
		
		Funcionario colab2 = new Funcionario("Wesley", "12", 1800.00, LocalDate.of(2002, 04, 30), null);
		Endereco doDois = new Endereco("SC", "Indaial", 182, "Rua Frederico Jensen", "89068900");
		colab1.endereco = doDois;
		
		Funcionario colab3 = new Funcionario("Emerson", "11", 2320.00, LocalDate.of(1999, 12, 31), null);
		Endereco doTres = new Endereco("SC", "Brusque", 97, "Rua Gustavo Zimmerman", "89012239");
		colab1.endereco = doTres;
		
		Funcionario colab4 = new Funcionario("Fabricio", "9", 4310.00, LocalDate.of(1998, 9, 11), null);
		Endereco doQuatro = new Endereco("SC", "Joinville", 32, "Rua Gergo Fridrich Mhodorst", "89062580");
		colab1.endereco = doQuatro;
		
		Funcionario colab5 = new Funcionario("Henrique", "8", 1300.00, LocalDate.of(1997, 05, 25), null);
		Endereco doCinco = new Endereco("SC", "Itajai", 289, "Rua Tamarindo", "89012420");
		colab1.endereco = doCinco;
		
		
		HashMap<String, String> lista = new HashMap<String, String>();
		lista.put( colab1.getId(), colab1.getNome());
		lista.put( colab2.getId(), colab2.getNome());
		lista.put( colab3.getId(), colab3.getNome());
		lista.put( colab4.getId(), colab4.getNome());
		lista.put( colab5.getId(), colab5.getNome());
		
		
		System.out.println(lista);
	}

}
