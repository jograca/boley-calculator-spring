package com.lm.claims.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lm.claims.models.Calculator;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

	@PostMapping("")
	@ResponseStatus(code = HttpStatus.OK)
	public Calculator getOneAll() {

		Calculator calculator = new Calculator(1.0, "*", 5.0);

		return calculator.calculateResult(calculator);
	}

}
