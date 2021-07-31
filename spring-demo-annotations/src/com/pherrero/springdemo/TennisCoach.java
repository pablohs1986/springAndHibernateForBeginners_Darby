package com.pherrero.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	// Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">>> TennisCoach: inside default constructor");
	}

	// init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>> TennisCoach: inside of doMyStartupStuff()");
	}

	// destroy method
	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println(">>> TennisCoach: inside of doMyDestroyStuff()");
	}

	// Constructor injection
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	// Setter injection
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println(">>> TennisCoach: inside setFortuneService()");
	 * this.fortuneService = fortuneService; }
	 */

	// Method injection
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println(">>> TennisCoach: inside setFortuneService()");
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
