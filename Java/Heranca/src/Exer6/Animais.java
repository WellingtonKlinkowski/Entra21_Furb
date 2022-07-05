package Exer6;

import java.util.Scanner;

public class Animais {

	Scanner input = new Scanner(System.in);
	
	private String raca;
	private String nomeIdnt;
	private String porte;
	private String habitat;
	private String paisOrg;
	
	public Animais(String raca, String nomeIdnt, String porte, String habitat, String paisOrg) {
		setRaca(raca);
		setNomeIdnt(nomeIdnt);
		setPorte(porte);
		setHabitat(habitat);
		setPaisOrg(paisOrg);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		System.out.println("Qual a raça?");
		raca = input.next();
		this.raca = raca;
	}

	public String getNomeIdnt() {
		return nomeIdnt;
	}

	public void setNomeIdnt(String nomeIdnt) {
		System.out.println("Qual o nome do animal?");
		nomeIdnt = input.next();
		this.nomeIdnt = nomeIdnt;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		System.out.println("Qual o tamanho?");
		porte = input.next();
		this.porte = porte;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		System.out.println("Qual o habitat?");
		habitat = input.next();
		this.habitat = habitat;
	}

	public String getPaisOrg() {
		return paisOrg;
	}

	public void setPaisOrg(String paisOrg) {
		System.out.println("Qual o país de origem?");
		paisOrg = input.next();
		this.paisOrg = paisOrg;
	}
	
	
	
	
}
