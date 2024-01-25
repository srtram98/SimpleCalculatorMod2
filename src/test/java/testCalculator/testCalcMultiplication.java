package testCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import simpleCalculator.Calculator;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Jan 23, 2024
 */
public class testCalcMultiplication {
	
	Calculator calc = new Calculator();

	@Test
	public void testMultiplication() {
		assertEquals(10, calc.multiplication(2, 5), 1);
		assertEquals(-25, calc.multiplication(5, -5), 1);
		assertEquals(9, calc.multiplication(-3, -3), 1);
	}

	@Test
	public void testMultiplicationBoolean() {
		assertTrue(calc.multiplication(7, 0) == 0);
		assertFalse(calc.multiplication(-4, -2) < 0);
	}
}
