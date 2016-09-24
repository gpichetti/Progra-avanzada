package luchadoresJaponeses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Torneo {
	
	Luchador [] vecLuchador;
	int cant;
	int [] resultado;	
	
	public Torneo (String ruta) throws FileNotFoundException {	
		Scanner sc = new Scanner(new File(ruta));
		this.cant = sc.nextInt();
		this.vecLuchador = new Luchador [this.cant];
		this.resultado = new int [cant];
		for(int i = 0; i < this.cant; i++){
			this.resultado[i] = 0;
		}
		String line;
		line = sc.nextLine();
				
		for (int i = 0; i < this.vecLuchador.length; i++) {
			String [] datos = {"0","0"};
			line = sc.nextLine();
			datos = line.split(" ");					
			int p = Integer.parseInt(datos[0]);
			int h = Integer.parseInt(datos[1]);			
			this.vecLuchador[i] = new Luchador(p, h);
			//vecLuchador[i].setPeso(Integer.parseInt(datos[0]));
			//vecLuchador[i].setAltura(Integer.parseInt(datos[1]));
			//System.out.println(vecLuchador[i]);
		}
		sc.close();
	}

	public void Resolver() throws IOException{
			
		PrintWriter salida = new PrintWriter(new FileWriter("sumo.out"));  //  preparo el arch de salida
	    		
		for(int i = 0; i < this.cant; i++){
			for(int j =0; j < this.cant; j++){
				if(i!=j && this.vecLuchador[i].comparar(this.vecLuchador[j])){
					this.resultado[i]++;
				}
			}
			System.out.println(this.resultado[i]);
			salida.println(this.resultado[i]);
		}
		salida.close();
	}
	
	
}
