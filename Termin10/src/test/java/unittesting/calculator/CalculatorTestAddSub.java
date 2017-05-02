package unittesting.calculator;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTestAddSub {
	
	private Calculator calculator;

	@BeforeMethod
	public void setUp() {
		calculator = new Calculator();
		calculator.clear();
	}

	@Test
	public void addTest() {
		calculator.add(1);
		calculator.add(1);
		assertEquals(calculator.getResult(), 2);

	}

	@Test
	public void substractTest() {
		calculator.substract(5);
		calculator.substract(5);
		assertEquals(calculator.getResult(), -10);
	}
}
