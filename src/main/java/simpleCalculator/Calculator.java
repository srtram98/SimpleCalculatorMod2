package simpleCalculator;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Jan 23, 2024
 */
public class Calculator {
	
	public static void main(String [] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.division(2, 4));
	}
	
	
	public double addition(double num1, double num2) {
		return num1 + num2;
	}
	
	
	
	public double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	
	
	public double multiplication(double num1, double num2) {
		return num1 * num2;
	}
	
	
	public double division(double num1, double num2) {
		
		if (num1 == 0 || num2 == 0) {
			return 0;
		}
		
		return (double)(num1 / num2);
	}
}
