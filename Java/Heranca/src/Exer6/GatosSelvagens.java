package Exer6;

import java.util.Scanner;

public class GatosSelvagens extends Animais{

	String corPelagem;
	boolean possuiListras;
	
	public GatosSelvagens(String raca, String nomeIdnt, String porte, String habitat, String paisOrg, String corPelagem, boolean possuiListras) {
		super(raca, nomeIdnt, porte, habitat, paisOrg);
		setCorPelagem(corPelagem);
		setPossuiListras(possuiListras);
	}
	public String getCorPelagem() {
		return corPelagem;
	}
	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}
	public boolean isPossuiListras() {
		return possuiListras;
	}
	public void setPossuiListras(boolean possuiListras) {
		if(possuiListras == true) {
			Scanner input = new Scanner(System.in);
			System.out.println("1) Listrado | 2) Pintado | 3) Manchado.");
			int escolhaListras = input.nextInt();
			if(escolhaListras == 1) {
				String listras = "Listrado";
			}
			else if(escolhaListras == 2) {
				String listras = "Pintado";
			}
			else if(escolhaListras == 3) {
				String listras = "Manchado";
			}
		}
		else {
			System.out.println("Sem listras");
		}
		
	}
}
