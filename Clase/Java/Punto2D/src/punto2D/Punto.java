package punto2D;

public interface Punto {
	
	public Object clone ();
	public double obtenerDistancia(Object obj);
	public double obtenerDistanciaAlOrigen();
	public void desplazar (Object obj);
	public boolean equals (Object obj);
	
}
