package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//expose "/" that return "Hello World"
	
	@GetMapping
	public String sayHello() {
		return "Hello World! Time on Server is "+LocalDateTime.now();
	}
	
	//expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "run 5k daily";
	}
	
	// expose a new endpoint for fortune
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "HAri ni okay punya";
	}

}
