package luchadoresJaponeses;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ProgramaPrincipal {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Torneo t = new Torneo ("sumo.in");				
		
		t.Resolver();
		
		/*Luchador l1 = new Luchador(100,1200);
		Luchador l2 = new Luchador(99,1201);
		
		if(l1.comparar(l2)){
			System.out.println("GAno el 1");
		}
		System.out.println("GAno el 2");*/
	}

}
