package testCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import simpleCalculator.Calculator;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Jan 23, 2024
 */
public class testCalcSubtraction {
	
	Calculator calc = new Calculator();

	@Test
	public void testSubtraction() {
		assertEquals(-4, calc.subtraction(-2, 2), 1);
		assertEquals(0, calc.subtraction(-4, -4), 1);
		assertEquals(3, calc.subtraction(0, -3), 1);
		assertNotEquals(0, calc.subtraction(9, -9));
	}

	@Test
	public void testSubtractionBoolean(){
		assertTrue(calc.subtraction(-3, -6) > 0);
		assertFalse(calc.subtraction(1, -1) == calc.subtraction(-1, 1));
	}
}
