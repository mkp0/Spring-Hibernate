package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	// no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach : This is no-arg constructor");
	}
	
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}




	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : This is emailAddress setter method");
		this.emailAddress = emailAddress;
	}




	public String getTeam() {
		return team;
	}




	public void setTeam(String team) {
		System.out.println("CricketCoach : This is team setter method");
		this.team = team;
	}




	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : This is fortuneService setter method");
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
