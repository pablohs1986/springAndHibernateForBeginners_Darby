package com.pherrero.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);

		Coach coach2 = context.getBean("tennisCoach", Coach.class);

		// check if they are the same
		boolean result = (coach == coach2);
		System.out.println(">>> Pointing to same object? " + result);
		System.out.println(">>> Memory location to coach " + coach);
		System.out.println(">>> Memory location to coach2 " + coach2);

		// close the context
		context.close();
	}

}
