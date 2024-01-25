package testCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import simpleCalculator.Calculator;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
public class testCalcDivision {

	Calculator calc = new Calculator();
	
	@Test
	public void testDivision() {
		assertEquals(2, calc.division(4, 2), 1);
		assertEquals(.5, calc.division(2, 4), 1);
	}
	
	@Test
	public void testDivisionBoolean() {
		assertTrue(calc.division(2, 0) == 0);
		assertFalse((int)calc.division(4, 2) < (int)calc.division(2, 4));
	}

}
