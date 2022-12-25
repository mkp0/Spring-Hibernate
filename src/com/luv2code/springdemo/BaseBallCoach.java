package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{
	
	// define a private field for 
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
