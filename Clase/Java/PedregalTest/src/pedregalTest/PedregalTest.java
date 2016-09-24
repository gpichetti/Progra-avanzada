package pedregalTest;

import java.io.File;
import java.util.Scanner;


public class PedregalTest {
	
	int matTerreno [][];
	
	public PedregalTest (String in, String out) throws Exception{
		
		Scanner scIn = new Scanner(new File(in));
		Scanner scOut = new Scanner(new File(out));
		
		int filasT;
		int columnasT;
		
		filasT = scIn.nextInt();
		columnasT = scIn.nextInt();
		
		//System.out.println(filasT);
		//System.out.println(columnasT);
		
		this.matTerreno = new int [filasT][columnasT];
		
		int frente;
		int largo;
		
		frente = scIn.nextInt();
		largo = scIn.nextInt();
		
		//System.out.println(frente);
		//System.out.println(largo);
		
		
		int cantPel;
		cantPel = scIn.nextInt();
		
		//System.out.println(cantPel);
		
		int x;
		int y;
		
		for(int i=0; i<cantPel ;i++){
			x=scIn.nextInt();
			y=scIn.nextInt();
			
			//System.out.println(x + " " + y);
			
			this.matTerreno[x-1][y-1] = 1;
		}
		
		
		String line;
		line = scOut.nextLine();
		
		//System.out.println(line);
		
		if (line.equals("NO")){
			throw new Exception("No contemplanos salidas NO del programa principal");
		}
		
		
		int posX;
		int posY;
		
		posX = scOut.nextInt();
		posY = scOut.nextInt();
		
		//System.out.println(posX + " " +  posY);
		
		line = scOut.nextLine();
		line = scOut.nextLine();
		
		//System.out.println(line);
		
		if (line.equals("N") || line.equals("S")){
			if (filasT < posX + frente || columnasT < posY + largo)
				throw new Exception("Salida iniválida: casa fuera de terreno");
			for (int j = posX - 1 ; j < (posX - 1 + frente) ; j++){
				for (int k = posY - 1 ; k < (posY - 1 + largo) ; k++){
					if(this.matTerreno [j][k] == 1)
						throw new Exception("Salida inválida: posición de la casa sobre peñasco");
						
				}
			}
			System.out.println("Salida posible");
		}
		
		if (line.equals("E") || line.equals("O")){
			if (filasT < posY + frente || columnasT < posX + largo)
				throw new Exception("Salida iniválida: casa fuera de terreno");
			for (int j = posY - 1 ; j < (posY - 1 + frente) ; j++){
				for (int k = posX - 1; k < (posX - 1+ largo) ; k++){
					if(this.matTerreno [j][k] == 1)
						throw new Exception("Salida inválida: posición de la casa sobre peñasco");
						
				}
			}
			System.out.println("Salida posible");
		}
		
		scIn.close();
		scOut.close();
		
		
	}

	
	
	public static void main(String[] args) throws Exception {
		
		PedregalTest p = new PedregalTest("Entrada.in","Salida.out");
		
			
		

	}

}
