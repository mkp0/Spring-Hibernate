package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// import bean from context
		Coach thecoach = context.getBean("tennisCoach",Coach.class);
		
		// call the method
		System.out.println(thecoach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
