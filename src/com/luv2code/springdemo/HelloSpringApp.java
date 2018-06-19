package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

//		load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class );
		
//		call methods on the bean
		System.out.println("22 - Hello Spring App" + theCoach.getDailyWorkout());
		System.out.println("24 - Hello Spring App" + theCoach.getDailyFortune() ); 
		
//		close the context 
		context.close(); 
	}

}
