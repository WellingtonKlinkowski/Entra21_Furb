package Exer6;

public class Aves extends Animais {

	private String corPenas;
	private String tipoComida;
	
	public Aves(String raca, String nomeIdnt, String porte, String habitat, String paisOrg, String corPenas, String tipoComida) {
		super(raca, nomeIdnt, porte, habitat, paisOrg);
		setCorPenas(corPenas);
		setTipoComida(tipoComida);
	}

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		if(getCorPenas().equalsIgnoreCase("Pretas") || getCorPenas().equalsIgnoreCase("Parda")) {
			
		}
		this.corPenas = corPenas;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
	
	
	
}
