package com.pherrero.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		SwinCoach coach = context.getBean("swimCoach", SwinCoach.class);

		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// call method to get the daily fortune
		System.out.println(coach.getDailyFortune());

		// swim methods
		System.out.println("Email: + " + coach.getEmail());
		System.out.println("Team: + " + coach.getTeam());

		// close the context
		context.close();
	}

}
