package testCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import simpleCalculator.Calculator;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Jan 23, 2024
 */
public class testCalcAddition {
	
	Calculator calc = new Calculator();

	@Test
	public void testAddition() {
		assertEquals(3, calc.addition(1, 2), 1);
		assertEquals(-1, calc.addition(4, -5), 1);
		assertEquals(1, calc.addition(1, 0), 1);
	}
	
	@Test
	public void testAdditionBoolean() {
		assertNotNull(calc.addition(0, 0));
		assertFalse(calc.addition(1, 1) == 1);
	}

}
