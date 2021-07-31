package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myGolfCoach", GolfCoach.class);

		System.out.println(theCoach.getDailyWorkOut());

		System.out.println(theCoach.getDailyFortune());

		context.close();
	}

}
