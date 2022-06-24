package Exer1;

public class InteiroPositivo {
	private int numX1;
	private int numX2;
	
	public InteiroPositivo() {
		super();
		setNumX1(numX1);
		setNumX2(numX2);
	}
	public int getNumX1() {
		return numX1;
	}
	public void setNumX1(int numX1) {
		this.numX1 = numX1;
	}
	public int getNumX2() {
		return numX2;
	}
	public void setNumX2(int numX2) {
		this.numX2 = numX2;
	}
	
	public void multi(int numX1, int numX2) {
		int multiplicacao = this.numX1 * this.numX2;
		System.out.println(multiplicacao);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
