package selMath;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MatrizMath {
	
	private double componente[][];
	private int columnas;
	private int filas;
	
	//Getters & Setters	
	public double[][] getComponente() {
		return componente;
	}
	public void setComponente(double[][] componente) {
		this.componente = componente;
	}
	public int getColumnas() {
		return columnas;
	}
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}

	//Contructor con lectura de archivo
	public MatrizMath(String ruta) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(ruta));
		this.filas = sc.nextInt();
		this.columnas = sc.nextInt();
		//System.out.println(this.filas);
		//System.out.println(this.columnas);	
		this.componente = new double [this.filas][this.columnas];
		
		int fila, columna;
		for (int i = 0; i < (this.filas * this.columnas); i++) {
			fila = sc.nextInt();
			columna = sc.nextInt();
			this.componente[fila][columna] = sc.nextDouble();
			//System.out.println(this.componente[fila][columna]);
		}
		sc.close();
	}
	
	//Constructor vacio tamaño fijo
	public MatrizMath(int fil, int col) {
		this.filas = fil;
		this.columnas = col;
		this.componente = new double[this.filas][this.columnas];
	}
	
	//Suma
	public MatrizMath suma(MatrizMath m2) throws Exception {
		if ((this.columnas == m2.columnas) && (this.filas == m2.filas)) {
			MatrizMath m3 = new MatrizMath(this.filas,this.columnas);
			for (int i = 0; i < this.filas; i++){
				for (int j = 0; j < this.columnas; j++){
					m3.componente[i][j] = this.componente[i][j] + m2.componente[i][j];
					System.out.println(m3.componente[i][j]);
				}
			}
			return m3;
		}
		throw new Exception("No se puede realizar la suma entre matrices de distinta dimension");
	}
	
	//Resta
	public MatrizMath resta(MatrizMath m2) throws Exception { 
		if ((this.columnas == m2.columnas) && (this.filas == m2.filas)) {
			MatrizMath m3 = new MatrizMath(this.filas,this.columnas);
			for (int i = 0; i < this.filas; i++){
				for (int j = 0; j < this.columnas; j++){
					m3.componente[i][j] = this.componente[i][j] - m2.componente[i][j];
					System.out.println(m3.componente[i][j]);
				}
			}
			return m3;
		}
		throw new Exception("No se puede realizar la resta entre matrices de distinta dimension");
	}
	
	//Multiplicar Matrices
	public MatrizMath multiplicarMatrices(MatrizMath m2) throws Exception {
		if(this.columnas == m2.filas){
			MatrizMath m3 = new MatrizMath(this.filas,m2.columnas);
			for (int i = 0; i < this.filas; i++) { 
	            for (int j = 0; j < m2.columnas; j++) {
	                for (int k = 0; k < this.columnas; k++) { 
	                    m3.componente[i][j] += this.componente[i][k] * m2.componente[k][j];
	                }
	                System.out.println(m3.componente[i][j]);
	            }
	        }
			return m3;
		}
		throw new Exception("No se puede realizar la multiplicacion entre estas matrices");
	}
	
	//Multiplicar Matriz por Vector
	public VectorMath multiplicarPorVector(VectorMath v2) throws Exception {
		if(this.columnas == v2.getCant()){
			VectorMath v3 = new VectorMath(this.filas);
			double res [] = new double [this.filas];
			for (int i = 0; i < this.filas; i++) {
                for (int k = 0; k < this.columnas; k++) { 
                   res [i] += (this.componente[i][k] * v2.getComponente()[k]);
	                   //System.out.println(v2.getComponente()[j]);
                }
	            //System.out.println(res[i]);
	        }
			v3.setComponente(res);
			return v3;
		}
		throw new Exception("No se puede realizar la multiplicacion entre esta matriz y este vector");
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatrizMath other = (MatrizMath) obj;
		if (columnas != other.columnas)
			return false;
		if (!Arrays.deepEquals(componente, other.componente))
			return false;
		if (filas != other.filas)
			return false;
		return true;
	}

	public static void main(String[] args) throws FileNotFoundException, Exception {
		
		Locale.setDefault(new Locale("en", "US"));
		MatrizMath m1 = new MatrizMath(
				"C:\\Users\\labunlam\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\mymatrix1.in");
		MatrizMath m2 = new MatrizMath(
				"C:\\Users\\labunlam\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\mymatrix1.in");
		
		VectorMath v1 = new VectorMath(
				"C:\\Users\\labunlam\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\myvector.in");
		
		
		VectorMath v2 = m1.multiplicarPorVector(v1);
		

		System.out.println(v2.getComponente()[0]);
		System.out.println(v2.getComponente()[1]);

	}

}
