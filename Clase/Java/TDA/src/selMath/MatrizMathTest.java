package selMath;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

public class MatrizMathTest {
	/*
	@Test
	public void pruebaSumaDeMatrices () throws FileNotFoundException, Exception {
		MatrizMath m1 = new MatrizMath(
				"C:\\Users\\laboratorios\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\mymatrix1.in");
		MatrizMath m2 = new MatrizMath(
				"C:\\Users\\laboratorios\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\mymatrix1.in");
		MatrizMath m3 = new MatrizMath(
				"C:\\Users\\laboratorios\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\resultadoSumaMatrix1.in");
		Assert.assertEquals(m3,m1.suma(m2));	
	}*/
	
	@Test
	public void pruebaMultiplicacionDeMatrices () throws FileNotFoundException, Exception {
		MatrizMath m1 = new MatrizMath(
				"C:\\Users\\laboratorios\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\mymatrix1.in");
		MatrizMath m2 = new MatrizMath(
				"C:\\Users\\laboratorios\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\mymatrix1.in");
		MatrizMath m3 = new MatrizMath(
				"C:\\Users\\laboratorios\\Desktop\\Clase_160819\\Clase_160819\\Java\\TDA\\src\\selMath\\resultadoMultiMatrix1.in");
		Assert.assertEquals(m3,m1.multiplicarMatrices(m2));	
	}

}
