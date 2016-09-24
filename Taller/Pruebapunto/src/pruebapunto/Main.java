package pruebapunto;

public class Main 
{
	public static void main(String[] args)
	{
		Punto p1 = new Punto(0, 0);
		Punto p2 = new Punto(1, 1);
		
		System.out.println(p1.obtenerDistancia(p2));
	}
}
