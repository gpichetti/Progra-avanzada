package punto2D;

public class Punto3D extends Punto2D {
	
	private double z;

	public Punto3D() {
		super();
		this.z = 0;
	}

	public Punto3D(double x, double y, double z) {
		super(x,y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "Punto3D [x=" + this.x + ", y=" + this.y + ", z=" + this.z + "]";
	}
	
	//Clonar
	public Punto3D clone (){
		Punto2D p2 = super.clone();
		return new Punto3D(p2.x, p2.y, this.z);
	}
	
	//Distancia entre dos puntos
	public double obtenerDistancia(Object p)
	{
		Punto3D pto3d;
		if(p instanceof Punto3D)
			pto3d = (Punto3D)p;
		else
			return -1;
		
		double difDistX, difDistY, difDistZ;
		
		difDistX = Math.abs(this.x - pto3d.x);
		difDistY = Math.abs(this.y - pto3d.y);
		difDistZ = Math.abs(this.z - pto3d.z);
		
		return Math.sqrt(Math.pow(difDistX, 2) + Math.pow(difDistY, 2) + Math.pow(difDistZ, 2));
	}
	
	public double obtenerDistanciaAlOrigen()
	{
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
	}
	
	public void cambiarUbicacion(double x, double y, double z)
	{
		super.cambiarUbicacion(x, y);
		this.z = z;
	}
	
	public void cambiarUbicacion(Punto3D p)
	{
		super.cambiarUbicacion(new Punto2D(p.x,p.y));
		this.z = p.z;
	}
	
	public void desplazar (Object punto)
	{
		Punto3D pto3d;
		if(punto instanceof Punto3D)
			pto3d = (Punto3D)punto;
		else
			return;
		
		super.desplazar(new Punto2D(pto3d.x, pto3d.y));
		this.z += pto3d.z;
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
}
