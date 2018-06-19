package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {
		

//		 load the spring configuration file
				
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml"); 

	
//	retrieve bean from spring container 
	Coach thecoach = context.getBean("myCoach", Coach.class);
	Coach alphacoach = context.getBean("myCoach", Coach.class); 
	
	boolean result = thecoach == alphacoach; 
	
	System.out.println("21 - result = "+ result );
	
	System.out.println("23 - thecoach = "+ thecoach );
	System.out.println("24 - alphacoach = "+ alphacoach );
	
//	 call methods on the bean 
	System.out.println("17- "+ alphacoach.getDailyFortune() );
	System.out.println("18- ");
	System.out.println("20- ");
	System.out.println("22- ");
	
//	close the context 
	context.close(); 
	
	}
}
