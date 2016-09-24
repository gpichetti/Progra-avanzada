package personaje;

import org.junit.Assert;
import org.junit.Test;


public class PersonajeTest {

	@Test
	public void testSerCurado() {
		Personaje humano = new Humano();
		Personaje vampiro = new Vampiro();
		Personaje orco = new Orco();
		
		humano.serCurado();
		vampiro.serCurado();
		orco.serCurado();
		
		Assert.assertEquals(100,humano.salud);
		Assert.assertEquals(100,vampiro.salud);
		Assert.assertEquals(100,orco.salud);
	}

	@Test
	public void testSerEnergizado() {
		Humano humano = new Humano();
		Vampiro vampiro = new Vampiro();
		Orco orco = new Orco();
		
		humano.serEnergizado();
		vampiro.serEnergizado();
		orco.serEnergizado();
		
		Assert.assertEquals(100,humano.energia);
		Assert.assertEquals(100,vampiro.energia);
		Assert.assertEquals(100,orco.energia);
	}
	
	@Test
	public void testAtacar(){
		Humano humano = new Humano();
		Orco orco = new Orco();
		Vampiro vampiro = new Vampiro();
		
		Assert.assertEquals(10,orco.calcularPuntosDeAtaque());
		orco.atacar(humano); //orco ataca con 10
		Assert.assertEquals(90,humano.salud);
		
		Assert.assertEquals(11,orco.calcularPuntosDeAtaque());
		orco.atacar(humano); //orco ataca con 11
		Assert.assertEquals(79,humano.salud);
		
		Assert.assertEquals(12,orco.calcularPuntosDeAtaque());
		orco.atacar(humano); //orco ataca con 12
		Assert.assertEquals(67,humano.salud);
		
		Assert.assertEquals(10,vampiro.calcularPuntosDeAtaque());
		vampiro.atacar(orco);
		orco.atacar(vampiro); //vampiro incrementa los ataquesRecibidos, y le suma esto a 10 para caluclar los ptos de ataque
		Assert.assertEquals(11,vampiro.calcularPuntosDeAtaque());
		
	}
	
	@Test
	public void testDespuesDeAtacar(){
		Orco orco = new Orco();
		Vampiro vampiro = new Vampiro();
		
		orco.atacar(vampiro);
		Assert.assertEquals(1,orco.cantidadDeAtaques);

		orco.atacar(vampiro);
		Assert.assertEquals(2,orco.cantidadDeAtaques);
		
		vampiro.atacar(orco);
		Assert.assertEquals(80,vampiro.salud);
		
	}
	
	@Test
	public void testDisminuyeEnergiaAlAtacar(){
		Humano humano = new Humano();
		Orco orco = new Orco();
		Vampiro vampiro = new Vampiro();
		
		orco.atacar(vampiro);
		Assert.assertEquals(90,orco.energia);

		orco.atacar(vampiro);
		Assert.assertEquals(79,orco.energia);
		
		humano.atacar(vampiro);
		Assert.assertEquals(90,humano.energia);
	}
	
}
