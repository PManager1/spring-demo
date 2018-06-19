package com.luv2code.springdemo;

public class TrackCoach implements Coach{

//	define a private field.
	private FortuneService fortuneService; 
	
	
// constructor  
	public TrackCoach( FortuneService theFortuneService ) {
		this.fortuneService = theFortuneService; 
//		setFortuneService(theFortuneService); 
	}

	
	@Override
	public String getDailyWorkout () {
		return "-- TrackCoach -  Do 80 - pushups";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

	public void doMyStartupStuff() {
		System.out.println("28 - doMyStartupStuff  ");
	}

   public void doMyDestroyStuff () {
	   System.out.println("32- doMyDestroyStuff  ");
    }


	
}
