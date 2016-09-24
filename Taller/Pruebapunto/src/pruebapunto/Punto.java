package pruebapunto;



public class Punto
{
	private double x;
	private double y;
	
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	public Punto()
	{
		this.x = this.y = 0;
	}
	
	public Punto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	public void cambiarUbicacion(double x, double y)
	{
		this.x = x;
		this.y = y;	
	}

	public void cambiarUbicacion(Punto p)
	{
		this.x = p.x;
		this.y = p.y;
	}
	
	public void desplazar (double distX, double distY)
	{
		this.x += distX;
		this.y += distY;
	}
	
	public double obtenerDistancia(Punto p)
	{
		double difDistX, difDistY;
		
		difDistX = Math.abs(this.x - p.x);
		difDistY = Math.abs(this.y - p.y);
		
		return Math.sqrt(Math.pow(difDistX, 2) + Math.pow(difDistY, 2));
	}
}

