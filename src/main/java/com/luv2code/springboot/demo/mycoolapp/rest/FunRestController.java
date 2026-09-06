package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// expose "/" that simply return Hello World
	
	@GetMapping("/")
	public String SayHello()
	{
		return "Hello World... The time on server is : "+LocalDateTime.now();
	}
	
	// code changes
	@GetMapping("/workout")
	public String getDailyWorkout()
	{
		return "Run hard 5km";
	}
	
	// code changes
	@GetMapping("/fortune")
	public String getDailyFortune()
	{
		return "Today is your lucky day";
	}
	

}
