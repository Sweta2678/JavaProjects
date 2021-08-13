package com.springbootlearning.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring Config file

		// java config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from the spring container
		// default bean id is : tennisCoach;; class name but first letter is small
		// if you write wrong bean id it will threw error "No such bean definition"or no
		// such bean named "name" defiined.
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(coach.getDailyWorkOut());

		// call get daily fortune
		System.out.println(coach.getDailyFortune());

		System.out.println("eamil"+coach.getEmail());
		
		System.out.println("eamil"+coach.getTeam());

		// close the context
		context.close();
	}
}
