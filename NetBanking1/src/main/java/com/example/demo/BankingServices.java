package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingServices {
	String accountType="Saving";
	
	
	@GetMapping("icici/welcome")
	String welcome() {
		return "welcome to hdfc";
	}
	
	@GetMapping("icici/openAccount/{name}/{address}/{email}")
	String openAccount(@PathVariable String name,@PathVariable String address,@PathVariable String email) {
		return "u r account is opened";
	}
	
	

}
