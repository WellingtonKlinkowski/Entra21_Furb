package Exer4;

public class Smartphone extends Computador{
	
	int selfies;

	public Smartphone(int ram, double armazenamento, boolean teclado, int selfies) {
		super(ram, armazenamento, teclado);
		setSelfies(selfies);
	}

	public int getSelfies() {
		return selfies;
	}

	public void setSelfies(int selfies) {
		this.selfies = selfies;
	}
	
	
	public void selfie() {
		this.selfies++;
		System.out.println(getSelfies());
	}
	
}
