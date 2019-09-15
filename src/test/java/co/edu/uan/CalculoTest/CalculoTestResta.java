package co.edu.uan.CalculoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoTestResta {

	@Test
	public void testResta() {
		int total = -15;
		int suma = (int) Calculo.resta(10, 25);
		assertEquals(total, suma);
	}

	@Test
	public void testRestaFallida() {
		int total = -50;
		double suma = Calculo.resta(10, 25);
		assertNotSame(total, suma);
	}
}
