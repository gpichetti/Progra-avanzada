package punto2D;


public class Punto2D{
	
	protected double x;
	protected double y;
	
	
	//2-Unica instancia
	private	static Punto2D instance = new Punto2D();
	
	//3-Manera de acceder a la instancia
	public static Punto2D getInstance(){
		return instance;
	}
	
	//Constructores
	protected Punto2D()
	{
		this.x = this.y = 0;
	}
	
	protected Punto2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Punto2D [x=" + this.x + ", y=" + this.y + "]";
	}
	
	//Clonar
	public Punto2D clone (){
		return new Punto2D(this.x,this.y);
	}
	
	//Distancia entre dos puntos
	public double obtenerDistancia(Object p)
	{
		Punto2D pto2d;
		if(p instanceof Punto2D)
			pto2d = (Punto2D)p;
		else
			return -1;
		
		double difDistX, difDistY;
		
		difDistX = Math.abs(this.x - pto2d.x);
		difDistY = Math.abs(this.y - pto2d.y);
		
		return Math.sqrt(Math.pow(difDistX, 2) + Math.pow(difDistY, 2));
	}
	
	public double obtenerDistanciaAlOrigen()
	{
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	
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

	public void cambiarUbicacion(double x, double y)
	{
		this.x = x;
		this.y = y;	
	}

	public void cambiarUbicacion(Punto2D p)
	{
		this.x = p.x;
		this.y = p.y;
	}
	
	public void desplazar (Object punto)
	{
		Punto2D pto2d;
		if(punto instanceof Punto2D)
			pto2d = (Punto2D)punto;
		else
			return;
		
		this.x += pto2d.x;
		this.y += pto2d.y;
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto2D other = (Punto2D) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
		
	

	
}

