package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach") //<- bean id
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice tour backhand volley";
	}

}
