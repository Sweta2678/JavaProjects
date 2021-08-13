package com.springbootlearning.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// java config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// such bean named "name" defiined.
		Coach coach = context.getBean("swimCoach", Coach.class);

		// call a method on the bean
		System.out.println(coach.getDailyWorkOut());

		// call get daily fortune
		System.out.println(coach.getDailyFortune());

		// close the context
		context.close();
	}
}
