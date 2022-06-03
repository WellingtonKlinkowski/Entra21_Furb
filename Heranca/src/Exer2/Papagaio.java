package Exer2;

public class Papagaio extends Animal{

	private String raca;

public Papagaio(String raca) {

	this.raca = raca;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

public void Barulho(){
	System.out.println("Seu barulho é Pruu loro pruu loro");
}
	
}
