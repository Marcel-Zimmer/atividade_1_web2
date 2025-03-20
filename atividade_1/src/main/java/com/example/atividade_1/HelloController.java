package com.example.atividade_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")

public class HelloController {
	
	@GetMapping("/somar/{num1}/{num2}")
	public String num1(@PathVariable String num1,@PathVariable String num2) {
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		
		return String.format("O resultado da soma de %.0f + %.0f é %.0f", numero1, numero2, numero1 + numero2);
	}

}
