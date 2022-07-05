package ExerSwitch2;

public class Operacoes {
	int num1;
	int num2;

	public Operacoes(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void soma(int num1, int num2) {

		System.out.println("Resultado da soma = "  + (num1 + num2));
	}

	public void subtracao(int num1, int num2) {

		System.out.println("Resultado da subtração = "  + (num1 - num2));
	}

	public void divisao(int num1, int num2) {

		System.out.println("Resultado da disivão = "  + (num1 / num2));
	}

	public void multiplicacao(int num1, int num2) {

		System.out.println("Resultado da multiplicação = "  + (num1 * num2));
	}

}
