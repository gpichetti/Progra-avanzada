package fibonacci;
import org.junit.Assert;
import org.junit.Test;


public class FibonacciTest {
	
	@Test(expected=RuntimeException.class)
	public void pruebaDeCasosExcepcionales () {
		Fibonacci.de(0);
	}
	
	@Test
	public void pruebaDeLaSucesion () {
		Assert.assertEquals(1, Fibonacci.de(1));
		Assert.assertEquals(1, Fibonacci.de(1));
				
	}

}
