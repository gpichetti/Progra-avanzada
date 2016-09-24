package casa;

public class Circulo extends Figura {

	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getSize(){
		return Math.PI*(Math.pow(this.radio,2));
	}
	
}
