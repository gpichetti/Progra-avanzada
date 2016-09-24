package luchadoresJaponeses;

public class Luchador {

	private int peso;
	private int altura;

	// Getter & Setters
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//Constructor con parametro
	public Luchador (int p, int h){
		setPeso(p);
		setAltura(h);
	}
	
	//Comparar
	public boolean comparar (Luchador l){
		if ((this.peso > l.peso && this.altura > l.altura ) || (this.peso > l.peso && this.altura == l.altura) || (this.peso == l.peso && this.altura > l.altura))
			return true;
		return false;	
	}
	
	// toString
	public String toString() {
		return getPeso() + " " + getAltura();
	}
	
}
