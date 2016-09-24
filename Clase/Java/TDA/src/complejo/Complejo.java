package complejo;

import java.util.Arrays;

public class Complejo implements Comparable<Complejo> {

	// Atributos
	private double real;
	private double img;

	// Getters and Setters
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImg() {
		return img;
	}

	public void setImg(double img) {
		this.img = img;
	}

	// Constructor parametrizado
	public Complejo(double real, double img) {
		setReal(real);
		setImg(img);
	}

	// Constructor por defecto
	public Complejo() {
		this(0, 0);
	}

	// toString
	public String toString() {
		return "(" + getReal() + "," + getImg() + ")";
	}

	// CompareTo
	@Override
	public int compareTo(Complejo o) {
		if (this.modulo() > o.modulo())
			return 1;

		if (this.modulo() < o.modulo())
			return -1;

		return 0;
	}

	public double modulo() {
		return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.img, 2));
	}

	public Complejo sumar(Complejo o) {
		return new Complejo(this.real + o.real, this.img + o.img);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(img) != Double.doubleToLongBits(other.img))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}

	public static void main(String[] args) {

		/*
		 * Complejo c1 = new Complejo(); System.out.println(c1);
		 * 
		 * Complejo[] vecComplejo = new Complejo[10]; for (int i = 0; i < 10;
		 * i++) vecComplejo[i] = new Complejo(i - 10, i - 10);
		 * 
		 * for (int i = 0; i < 10; i++) System.out.println(vecComplejo[i]);
		 * 
		 * //Arrays.sort(vecComplejo);
		 * 
		 * for (int i = 0; i < 10; i++) System.out.println(vecComplejo[i]);
		 */

		Complejo c1 = new Complejo(2, 2);
		Complejo c2 = new Complejo(3, 3);
		
		
		// System.out.println(c1.compareTo(c2));

		//Complejo c3 = new Complejo();
		Complejo c3 = c1.sumar(c2);
		System.out.println(c3);

	}

}
