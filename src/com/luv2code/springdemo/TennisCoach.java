package com.luv2code.springdemo;

import org.springframework.stereotype.Component;


// @Component --> this will take beanID as tennisCoach
@Component("abc")
public class TennisCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
}
