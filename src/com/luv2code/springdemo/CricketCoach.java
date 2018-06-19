package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team; 
	
	private FortuneService fortuneService; 
	
	
//	 no-arg constructor
	public CricketCoach () { 
		System.out.println("calling CricketCoach no arg constructor");
		}

	
	public void setEmailAddress(String emailAddress) {
		System.out.println("18-calling CricketCoach setEmailAddress  method");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("23-calling CricketCoach setTeam  method");
		this.team = team;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	//	our setter method 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("30-calling CricketCoach setFortuneService method");
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
