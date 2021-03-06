package casa;
import org.junit.Assert;
import org.junit.Test;

public class FiguraCompuestaTest {

	@Test
	public void pruebaDeFiguraCompuesta () {
		
		Circulo rueda = new Circulo(1);
		Circulo otraRueda = new Circulo(1);
		Rectangulo caja = new Rectangulo(4,2);
		
		FiguraCompuesta vagon = new FiguraCompuesta();
		FiguraCompuesta tren = new FiguraCompuesta();
		
		vagon.add(rueda);
		vagon.add(otraRueda);
		vagon.add(caja);
		
		double result = (8 + (2*Math.PI));
		Assert.assertEquals(result, vagon.getSize(), 1E-8);
		
		
		
		tren.add(vagon);
		tren.add(vagon);
		
		System.out.println(tren.getSize());
		Assert.assertEquals(2*result, tren.getSize(), 1E-8);
	
	}
}
