package com.coder.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring Config file 
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the spring container
		//default bean id is : tennisCoach;; class name but first letter is small
		
		//if you write wrong bean id it will threw error  "No such bean definition"or no such bean named "name" defiined.
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean 
		System.out.println(coach.getDailyWorkOut());
		
		//call get daily fortune 
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
