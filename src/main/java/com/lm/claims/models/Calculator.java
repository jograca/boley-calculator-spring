package com.lm.claims.models;

public class Calculator {

	private double firstNumber;
	private double secondNumber;
	private String operation;

	public Calculator(double firstNumber, String operation, double secondNumber) {

		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operation = operation;
	}

	public double calculateResult(Calculator calculator) {
		double result = 0;

		if ("+".equals(operation)) {
			result = firstNumber + secondNumber;
		} else if ("-".equals(operation)) {
			result = firstNumber - secondNumber;
		} else if ("*".equals(operation)) {
			result = firstNumber * secondNumber;
		} else if ("/".equals(operation)) {
			result = firstNumber / secondNumber;
		} else {
			throw new RuntimeException("Operation not implemented");
		}

		return result;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}
