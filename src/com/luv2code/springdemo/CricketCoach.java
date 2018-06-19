package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService; 
	
//	 no-arg constructor
	public CricketCoach () { 
		System.out.println("calling CricketCoach no arg constructor");
		}

	//	our setter method 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("calling CricketCoach setFortuneService method");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "do some work for cricket - practice fast bowling ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
