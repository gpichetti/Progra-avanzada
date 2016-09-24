package pruebapunto;

public class Circulo
{
	private Punto punto;
	private double radio;
	
	
	public Circulo()
	{
		this.radio = 1;
		this.punto = new Punto();
	}
	
	public Circulo(double radio, Punto punto)
	{
		this.radio = radio;
		this.punto = punto;
	}
	
	
	public double area()
	{
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double perimetro()
	{
		return 2 * Math.PI * radio;
	}
	
	public boolean seIntersecta(Circulo c2)
	{
		return this.punto.obtenerDistancia(c2.punto) <= this.radio + c2.radio;
	}
	
	public boolean contienePunto(Punto p)
	{
		return this.punto.obtenerDistancia(p) <= this.radio;
	}
	
}



