package Exer4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Funcionario pessoa = new Funcionario(null, null, null, null,null );
		
		System.out.println("QUAL SEU NOME");
		pessoa.setNome(input.next());
		System.out.println("QUAL SEU ID");
		pessoa.setId(input.next());
		System.out.println("QUAL SUA DATA DE INGRESSO");
		pessoa.setIngresso(LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt()));
		System.out.println("QUAL SUA DATA DE NASCIMENTO. AA MM DD");
		pessoa.setIngresso(LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt()));
		System.out.println("QUAL SUA RUA");
		Endereco e = new Endereco(null, null, null);
		e.setRua(input.next());
		System.out.println("QUAL SEU CEP");
		e.setCep(input.next());
		System.out.println("QUAL O NUMERO DA SUA CASA");
		e.setNumero(input.next());
		pessoa.setEndereco(e);

		System.out.println("1) Funcionário | 2) Aluno");
		int escolha = input.nextInt();

		if (escolha == 1) {
			//funcionario
			System.out.println("Qual sua carga horária?");
			pessoa.setCargaHoraria(input.nextDouble());
			pessoa.aumentarCarga();
			pessoa.demitir();
		}
		if (escolha == 2) {
			//aluno

		}

	}

}
