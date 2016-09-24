package formandoEquipos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FormandoEquipos {
	
	int preguntas;
	int colaboradores;
	String respuestas[];

	
	public FormandoEquipos (String ruta) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(ruta));
		this.preguntas = sc.nextInt();
		this.colaboradores = sc.nextInt();	
		this.respuestas = new String [this.colaboradores];
		sc.nextLine();
		for (int i = 0; i < (this.colaboradores); i++) {
			this.respuestas[i]=sc.nextLine();
		}
		sc.close();
			
	}
	
	public void resolver() throws IOException{
		String cadena = "";
		String cadenaMax = "";
		int cantidadColaboradores;
		int cantidadCaracteres;
		double afinidad=0;
		this.ordenar();
		for (int k=0; k<this.preguntas; k++){		
			cantidadCaracteres = this.preguntas - k;
			for(int i=0;i<this.colaboradores;i++){
				cantidadColaboradores=1;
				for (int j=i+1;j<this.colaboradores;j++){
					//if(this.respuestas[i].equals(this.respuestas[j])){
					if(this.respuestas[i].substring(0,cantidadCaracteres).equals(this.respuestas[j].substring(0,cantidadCaracteres))){
						cadena=this.respuestas[i].substring(0,cantidadCaracteres);
						cantidadColaboradores++;
					}
				}
				if((Math.pow(cantidadCaracteres,2)*cantidadColaboradores) > afinidad ){
					afinidad = (Math.pow(cantidadCaracteres,2)*cantidadColaboradores);		
					cadenaMax = cadena;
				}
			}
		}
		
		System.out.println(afinidad);
		System.out.println(cadenaMax);
		PrintWriter salida = new PrintWriter(new FileWriter("salida.out")); 
		salida.println(afinidad);
		salida.println(cadenaMax);
		salida.close();
				
	}
	
	
	
	public void ordenar(){
		Arrays.sort(this.respuestas);
		for (int i = 0; i < (this.colaboradores); i++) {
			System.out.println(this.respuestas[i]);
			}		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		FormandoEquipos f = new FormandoEquipos("equipo.in");
		f.resolver();
	}

}
