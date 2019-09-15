package co.edu.uan.CalculoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoTestDivision {


	@Test (expected =ArithmeticException.class)
	public void testDivisionException() {
		int var = 0;
		Calculo.division(10,var);
	}
	
	@Test
	public void testDivision() {
		double result = 2;
		double val = Calculo.division(4, 2);
		assertTrue("Correcto",result==val);
	}

}
