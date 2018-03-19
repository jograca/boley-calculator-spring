package com.lm.claims.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lm.claims.models.Calculator;

@RestController
@RequestMapping("/api/calculator/")
public class CalculatorApiController {

	public CalculatorApiController() {

	}

	@PostMapping("calculate")
	public double calculateResult(@RequestBody Calculator calculator) {

		double result = 0;

		if ("add".equals(calculator.getOperation())) {
			result = calculator.getFirstNumber() + calculator.getSecondNumber();
		} else if ("subtract".equals(calculator.getOperation())) {
			result = calculator.getFirstNumber() - calculator.getSecondNumber();
		} else if ("multiply".equals(calculator.getOperation())) {
			result = calculator.getFirstNumber() * calculator.getSecondNumber();
		} else if ("divide".equals(calculator.getOperation())) {
			result = calculator.getFirstNumber() / calculator.getSecondNumber();
		} else {
			throw new RuntimeException("Operation not implemented");
		}

		return result;
	}

}
