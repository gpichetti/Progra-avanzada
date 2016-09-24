package casa;

public class Triangulo extends Figura{
	
	double base;
	double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getSize(){
		return (base*altura)/2;
	}
	
	
	

}
