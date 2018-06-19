package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
//		 load the spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
//		retrieve bean from spring container 
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class );
		
//		 call methods on the bean 
		System.out.println("17- "+ theCoach.getDailyFortune() );
		System.out.println("18- "+ theCoach.getDailyWorkout() );
		
		System.out.println("20- "+ theCoach.getEmailAddress() );
		
		System.out.println("22- "+ theCoach.getTeam() );
			
		
//		close the context 
		context.close(); 

	}

}
