package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach : This is no-arg constructor");
	}
	
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : This is setter method");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout(){
		return "Practice bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
