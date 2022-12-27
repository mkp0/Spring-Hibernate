package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml"); 
		
		// retrieve bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		// check if they are same
		
		boolean result = theCoach==alphaCoach;
		
		System.out.println("\nPointing to the same object : " + result);
		
		// printing their memory location
		System.out.println("\nPointing to the same object : " + theCoach);
		
		System.out.println("\nPointing to the same object : " + alphaCoach);
		
		// close the context
		context.close();
		
	}

}
