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
		double first = calculator.getFirstNumber();
		double second = calculator.getSecondNumber();
		String operator = calculator.getOperation();

		if ("add".equals(operator)) {
			result = first + second;
		} else if ("subtract".equals(operator)) {
			result = first - second;
		} else if ("multiply".equals(operator)) {
			result = first * second;
		} else if ("divide".equals(operator)) {
			result = first / second;
		} else {
			throw new RuntimeException("Operation not implemented");
		}

		return result;
	}

}
