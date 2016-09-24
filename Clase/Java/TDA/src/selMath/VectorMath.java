package selMath;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class VectorMath {

	private double componente[];
	private int cant;
	
	//Getters & Setters	
	public double[] getComponente() {
		return componente;
	}
	public void setComponente(double[] componente) {
		this.componente = componente;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	
	//Contructor con lectura de archivo
	public VectorMath(String ruta) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(ruta));
		this.cant = sc.nextInt();
		//System.out.println(cant);
		this.componente = new double[this.cant];
		for (int i = 0; i < this.cant; i++) {
			this.componente[i] = sc.nextDouble();
			//System.out.println(this.componente[i]);
		}
		sc.close();
	}
	
	//Constructor vacio tamaño fijo
	public VectorMath(int tam) {
		this.cant = tam;
		this.componente = new double[this.cant];
	}
	
	//Suma
	public VectorMath suma(VectorMath v2) throws Exception {
		if (this.cant == v2.cant) {
			VectorMath v3 = new VectorMath(this.cant);
			for (int i = 0; i < this.cant; i++) {
				v3.componente[i] = this.componente[i] + v2.componente[i];
				//System.out.println(v3.componente[i]);
			}
			return v3;
		}
		throw new Exception ("No se puede realizar la suma entre vectores de distinta dimension");
	}
	
	//Resta
	public VectorMath resta(VectorMath v2) throws Exception {
		if (this.cant == v2.cant) {
			VectorMath v3 = new VectorMath(this.cant);
			for (int i = 0; i < this.cant; i++) {
				v3.componente[i] = this.componente[i] - v2.componente[i];
				//System.out.println(v3.componente[i]);
			}
			return v3;
		}
		throw new Exception ("No se puede realizar la resta entre vectores de distinta dimension");
	}
	
	//Producto entre vectores
	public double productoescalar(VectorMath v2) throws Exception {
		if (this.cant == v2.cant) {
			double res;
			res=0;
			for (int i = 0; i < this.cant; i++) {
				res += this.componente[i] * v2.componente[i];
			}
			return res;
		}
		throw new Exception("No se puede realizar el producto escalar entre vectores de distinta dimension");
	}
	
	//Producto por escalar
	public VectorMath prodreal(double r) {
			VectorMath v3 = new VectorMath(this.cant);
			for (int i = 0; i < this.cant; i++) {
				v3.componente[i] = this.componente[i] * r;
				System.out.println(v3.componente[i]);
			}
			return v3;
	}
	
	//Norma
	public double norma(int normax) {
		double n=0;
		for (int i = 0; i < this.cant; i++) {
			n+=Math.pow(Math.abs(this.componente[i]), normax);
		}
		n=Math.pow(n,Math.pow(normax,-1));
		return n;
	}

	//Equals
	public boolean equals (VectorMath v2) {
		return Arrays.equals(this.componente,v2.componente);
	}
	
	//Clonar
	public void clonar (VectorMath v){
		this.cant = v.cant;
		this.componente = v.componente;
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, CloneNotSupportedException, Exception {

		Locale.setDefault(new Locale("en", "US"));
		VectorMath v1 = new VectorMath(
				"C:\\Users\\laboratorios\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\myvector.in");
		VectorMath v2 = new VectorMath(
				"C:\\Users\\laboratorios\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\myvector1.in");
		/*v1.suma(v2);
		v1.resta(v2);
		v1.productoescalar(v2);
		double real=5;
		v1.prodreal (real);
		v1.norma(3);*/
		//v1.equal(v2);
		//VectorMath v3 = new VectorMath(v1.cant);
		//v3.clonar(v1);
		/*
		for (int i = 0; i < v3.cant; i++){
			System.out.println(v3.componente[i]);
		}
		*/
		
		v1.productoescalar(v2);
		
	}
	
}
