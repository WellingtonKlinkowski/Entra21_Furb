package TratamentoExcecao9;

import java.util.Scanner;

public class Notas {
	Scanner input = new Scanner(System.in);

	double nota1;
	double nota2;
	double nota3;
	double media;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("Sua nota está fora dos padrões.");
			System.out.println("Digite sua primeira nota corretamente: ");
			this.nota1 = input.nextDouble();
		}

		else {
			this.nota1 = nota1;
		}
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		if (nota2 < 0 || nota2 > 10) {
			System.out.println("Sua nota está fora dos padrões.");
			System.out.println("Digite sua primeira nota corretamente: ");
			this.nota2 = input.nextDouble();
		} 
		else {
			this.nota2 = nota2;
		}
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		if (nota3 < 0 || nota3 > 10) {
			System.out.println("Sua nota está fora dos padrões.");
			System.out.println("Digite sua primeira nota corretamente: ");
			nota3 = input.nextDouble();
		} 
		else {
			this.nota3 = nota3;
		}
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public void media(double nota1, double nota2, double nota3) {
		this.media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Sua média é " + this.media);
	}

}
