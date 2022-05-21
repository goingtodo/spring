package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach: inside of doMyStartupStuff()");
	}
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach: inside of doMyCleanupStuff()");
	}
	
	//define my destroy method

	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">>TennisCoach: inside  doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuenService) {
		fortuneService = theFortuenService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice tour backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
