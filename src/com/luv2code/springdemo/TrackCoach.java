package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside of init method doMyStartupStuff");
	}
	
	// destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : inside of destroy method doMyCleanupStuff");
	}

}
