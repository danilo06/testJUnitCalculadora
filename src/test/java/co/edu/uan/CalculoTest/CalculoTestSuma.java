/**
 * 
 */
package co.edu.uan.CalculoTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author USER
 *
 */
public class CalculoTestSuma {

	/**
	 * Test method for {@link co.edu.uan.CalculoTest.Calculo#suma(int, int)}.
	 */
	@Test
	public void testSuma() {
		int total = 35;
		int suma = (int) Calculo.suma(10, 25);
		assertEquals(total,suma);
	}
	
	@Test
	public void testSumaFallida() {
		int total = 15;
		double suma = Calculo.suma(10, 25);
		assertNotSame(total,suma);
	}

	

}
