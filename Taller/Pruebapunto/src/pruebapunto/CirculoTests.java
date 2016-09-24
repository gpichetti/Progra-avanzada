package pruebapunto;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTests {
	@Test
	public void queNoIntersectan () {
		Circulo c1= new Circulo(1,new Punto(0,0));
		Circulo c2= new Circulo(1,new Punto(10,10));
		Assert.assertFalse(c1.seIntersecta(c2));		
	}
	
	@Test
	public void queIntersectan () {
		Circulo c1= new Circulo(1,new Punto(0,0));
		Circulo c2= new Circulo(1,new Punto(0.5,0.5));
		Assert.assertTrue(c1.seIntersecta(c2));
	}	
	
	@Test
	public void circuloContienPunto () {
		Circulo c1= new Circulo(5,new Punto(0,0));
		Punto p1= new Punto (0,0);
		Assert.assertTrue(c1.contienePunto (p1));
		Punto p2= new Punto (5,0);
		Assert.assertTrue(c1.contienePunto (p2));
		Punto p3= new Punto (0,5);
		Assert.assertTrue(c1.contienePunto (p3));
		Punto p4= new Punto (1,1);
		Assert.assertTrue(c1.contienePunto (p4));
	}
	@Test
	public void circuloNoContienPunto () {
		Circulo c1= new Circulo(5,new Punto(0,0));
		Punto p1= new Punto (5,5);
		Assert.assertFalse(c1.contienePunto (p1));
	}
}
