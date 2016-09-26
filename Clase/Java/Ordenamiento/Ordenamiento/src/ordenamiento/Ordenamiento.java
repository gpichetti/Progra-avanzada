package ordenamiento;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Ordenamiento {

	double [] vector;
	int tam;
	
	public Ordenamiento(int tam) {
		this.vector = new double [tam];
		this.tam = tam;
		
		for(int i=0;i<this.tam;i++){
//			this.vector[i] = Math.random() * (this.tam - i) ;
			this.vector[i] = this.tam - i ;
		}
	}
	
	public void seleccion(){
		Calendar tIni = new GregorianCalendar();
	
		double aux;
		double menor;
		int pos;

		for(int i = 0 ; i < this.tam-1 ; i++){
			menor = this.vector[i];
			pos = i;
			for(int j=i+1 ; j < this.tam; j++){
				if( this.vector[j] < menor ){
					menor = this.vector[j];
					pos = j;
				}
			}
			aux = this.vector[i];
			this.vector[i] = menor;
			this.vector[pos] = aux;
		}
		
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println(diff);
	}
	
	public void burbujeo(){

		double aux;
		int largoVec = this.tam-1;
		
		Calendar tIni = new GregorianCalendar();
		
	    for (int i=0 ; i < largoVec ; i++)
	    {
	        for (int j=0; j < largoVec-i ; j++)
	        {
	            if (this.vector[j] >= this.vector[j+1])
	            {
	                aux=this.vector[j];
	                this.vector[j]=this.vector[j+1];
	                this.vector[j+1]=aux;
	            }
	        }
	    }
	    
	    Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println(diff);
	}
	
	
	/*public void insercion(){
	    int p, j;
	    double aux;
	    Calendar tIni = new GregorianCalendar();
	    for (p = 1; p < this.vector.length; p++){ // desde el segundo elemento hasta
	          aux = this.vector[p]; // el final, guardamos el elemento y
	          j = p - 1; // empezamos a comprobar con el anterior
	          while ((j >= 0) && (aux < this.vector[j])){ // mientras queden posiciones y el
	                                                                // valor de aux sea menor que los
	        	  this.vector[j + 1] = this.vector[j];       // de la izquierda, se desplaza a
	              j--;                   // la derecha
	          }
	          this.vector[j + 1] = aux; // colocamos aux en su sitio
	    }
	    Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println(diff);
	}*/
	
	public void insercion(){
	    int i, j, pos;
	    double aux;
	    Calendar tIni = new GregorianCalendar();
	   
	    for (i = 1; i < this.vector.length; i++){ 
	          aux = this.vector[i];
	          j = i-1;
	          pos=i; 
	          
	          while (j>=0)
	          {
	        	  if(aux < this.vector[j]){
	        		  this.vector[j + 1] = this.vector[j];
	        		  pos = j;
	        		  j--;
	        	  }else
	        		  j=-1;
	        	  
	          }

	          this.vector[pos] = aux;
	    }
	    
	    Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println(diff);
	}
	
	@Override
	public String toString() {
		String cad="";
		
		for(int i=0;i<this.vector.length;i++){
				cad += "[" + i + "] : " + this.vector[i] + "\n";
		}
		
		return cad;
	}

	public static void main(String[] args) {
		
		Ordenamiento ord = new Ordenamiento(10000);
//		System.out.println(ord.toString());
		ord.seleccion();
		
		Ordenamiento ord2 = new Ordenamiento(10000);
		ord2.burbujeo();
		
		Ordenamiento ord3 = new Ordenamiento(10000);
		ord3.insercion();
	}

}
