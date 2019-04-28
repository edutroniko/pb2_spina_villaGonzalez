package ar.edu.unlam.pb2.disco;

import org.junit.Test;
import org.junit.Assert;

public class DiscoTest {
	/*
	 * Usando radio interior 1.0 y exterior 2.0
	 * Se espera un perimetro interior de 6.28
	 * Se espera un perimetro superior de 12.56
	 * Se espera superficie de 9.42
	 */

	@Test
	public void probandoPerimetroInterior() {
		Double radioInterno = 1.0;
		Double radioExterno = 2.0;
		Double perimetroInteriorEsperado = 2.0*Math.PI*radioInterno;
		Double perimetroInteriorObtenido = 0.0;
		
		Disco nuevoDisco = new Disco(radioInterno, radioExterno);
		
		perimetroInteriorObtenido = nuevoDisco.perimetroInterior();
		
		Assert.assertEquals(perimetroInteriorEsperado, perimetroInteriorObtenido);
	}
	
	@Test
	public void probandoPerimetroExterior() {
		Double radioInterno = 1.0;
		Double radioExterno = 2.0;
		Double perimetroExteriorEsperado = 2.0*Math.PI*radioExterno;
		Double perimetroExteriorObtenido = 0.0;
		
		Disco nuevoDisco = new Disco(radioInterno, radioExterno);
		
		perimetroExteriorObtenido = nuevoDisco.perimetroExterior();
		
		Assert.assertEquals(perimetroExteriorEsperado, perimetroExteriorObtenido);
	}
	
	@Test
	public void probandoSuperficie() {
		Double radioInterno = 1.0;
		Double radioExterno = 2.0;
		
		Double superficieEsperada = Math.PI*Math.pow(radioExterno, 2) - Math.PI*Math.pow(radioInterno, 2);
		Double superficieObtenida = 0.0;
		
		Disco nuevoDisco = new Disco(radioInterno, radioExterno);
		
		superficieObtenida = nuevoDisco.superficie();
		
		Assert.assertEquals(superficieEsperada, superficieObtenida);
	}
	
	@Test
	public void probandoCambioRadioInterior() {
		Double radioInterno = 2.0;
		Double radioExterno = 4.0;
		Double nuevoRadioInterno = 3.0;
			
		Disco nuevoDisco = new Disco(radioInterno, radioExterno);
			
		Assert.assertTrue(nuevoDisco.cambiarRadioInterior(nuevoRadioInterno));
		Assert.assertEquals(nuevoRadioInterno, nuevoDisco.getRadioInterior());
	}
	
	@Test
	public void probandoCambioRadioExterior() {
		Double radioInterno = 2.0;
		Double radioExterno = 4.0;
		Double nuevoRadioExterno = 6.0;
			
		Disco nuevoDisco = new Disco(radioInterno, radioExterno);
			
		Assert.assertTrue(nuevoDisco.cambiarRadioInterior(nuevoRadioExterno));
		Assert.assertEquals(nuevoRadioExterno, nuevoDisco.getRadioExterior());
	}
}
	

