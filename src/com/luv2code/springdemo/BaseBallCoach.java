package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{
	
//	define a private field.
	private FortuneService fortuneService; 
	
	
	// constructor  
	public BaseBallCoach( FortuneService theFortuneService ) {
		this.fortuneService = theFortuneService; 
//		setFortuneService(theFortuneService); 
	}

	@Override
	public String getDailyWorkout () {
		return "--BaseBallCoach - getDailyWorkout ---   Do 30 - pushups";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}
