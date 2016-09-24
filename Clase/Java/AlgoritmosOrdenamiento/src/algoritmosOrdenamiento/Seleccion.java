package algoritmosOrdenamiento;

public class Seleccion {

	
	public static void main(String[] args) {
		
		int vec [] = {3,5,7,3,1,2,4,8,6};
		int posmin;
		int aux;
		int i;
		int j;
		
		for (i=0 ; i < vec.length ; i++)
			System.out.println(vec[i]);
		
		for (i = 0 ; i < vec.length -1 ; i++){ 		// Costo C1 + C2*n + C3*n
			posmin = i;								// Costo C1*n - C1
			for (j = i ; j < vec.length ; j++){		// Costo C1*n - C1 + (n^2)*C2 + ((n^2)/2)*C3
				if(vec[j] < vec[posmin]){			// Costo ((n^2)/2)*C4 - (n/2)*C4
					posmin = j;						// Costo ((n^2)/2)*C1 - (n/2)*C1
				}
			}
			aux = vec [i];							// Costo C1*n - C1
			vec [i] = vec [posmin];					// Costo C1*n - C1
			vec [posmin] = aux;						// Costo C1*n - C1
		}
		
		System.out.println(" ");
		
		for (i=0 ; i < vec.length ; i++)
			System.out.println(vec[i]);
		

	}

}
