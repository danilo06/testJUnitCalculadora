package co.edu.uan.CalculoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoTestDivision {

	@Test(expected = ArithmeticException.class)
	public void testDivisionException() {
		int var = 0;
		Calculo.division(10, var);
	}

	@Test
	public void testDivision() {
		double result = 2;
		double val = Calculo.division(4, 2);
		assertTrue("Correcto", result == val);
	}
	
	
	//Prueba de tiempo aprobada (posible variacion en funcion del equipo) 
	@Test(timeout=20)
	public void testDivisionTime() {
		double result = 2;
		double var = 1000000;
		for (int i=0;i<var;i++) {
			double val = Calculo.division(4, 2);
			val = val*2-45/45*83;
		}
		double val = Calculo.division(4, 2);
		assertTrue("Correcto", result == val);
	}
}
