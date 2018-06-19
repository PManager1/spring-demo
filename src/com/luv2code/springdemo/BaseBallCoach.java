package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService; 
	
	public BaseBallCoach( FortuneService theFortuneService ) {
		setFortuneService(theFortuneService); 
	}

	@Override
	public String getDailyWorkout () {
		return "--BaseBallCoach -  Do 30 - pushups";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
}
