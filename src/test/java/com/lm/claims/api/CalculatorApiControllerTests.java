package com.lm.claims.api;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lm.claims.models.Calculator;

public class CalculatorApiControllerTests {

	private CalculatorApiController contoller;
	private Calculator calculator = new Calculator();

	@Before
	public void setup() {
		contoller = new CalculatorApiController();
	}

	@Test
	public void givenTwoNumbersOneAndTwo_whenCalculate_thenReturnResultThree() {
		// Arrange
		calculator.setFirstNumber(3);
		calculator.setSecondNumber(0);
		calculator.setOperation("add");

		// Act
		double result = contoller.calculateResult(calculator);
		System.out.println(result);

		// Assert
		assertEquals(3, result, 0);
	}

	@Test
	public void givenTwoNumbersFiveAndFive_whenCalculate_thenReturnResultTwentyFive() {
		// Arrange
		calculator.setFirstNumber(5);
		calculator.setSecondNumber(5);
		calculator.setOperation("multiply");

		// Act
		double result = contoller.calculateResult(calculator);

		// Assert
		assertEquals(25, result, 0);
	}

	@Test
	public void givenDivideByZero_whenCalculate_returnPositiveInfinity() {
		// Arrange
		calculator.setFirstNumber(5);
		calculator.setSecondNumber(0);
		calculator.setOperation("divide");

		// Act
		double result = contoller.calculateResult(calculator);

		// Assert
		assertEquals(Double.POSITIVE_INFINITY, result, 0);
	}

	@Test
	public void givenSecondNumberLargerThanFirst_whenCalculate_returnNegativeNumber() {
		// Arrange
		calculator.setFirstNumber(5);
		calculator.setSecondNumber(6);
		calculator.setOperation("subtract");

		// Act
		double result = contoller.calculateResult(calculator);

		// Assert
		assertEquals(-1, result, 0);
	}

}
