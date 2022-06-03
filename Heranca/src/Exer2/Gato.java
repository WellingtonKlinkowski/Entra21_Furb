package Exer2;

public class Gato extends Animal{

	private String raca;

public Gato(String raca) {

	this.raca = raca;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

public void Barulho(){
	System.out.println("Seu barulho é Miau miau miau miau miau");
}
	
}
