package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve bean from context
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		// using method in bean
		
		System.out.println(thecoach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
