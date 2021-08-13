package com.coder.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach1 = context.getBean("tennisCoach",Coach.class);
		
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		
		//check the object equal or not 
		boolean result = (coach1==coach2);
		
		System.out.println("result : "+result);
		
		//print out memory location
		System.out.println("Memory location for first object 1:::"+coach1);
		
		System.out.println("Memory location for first object 2:::"+coach2);
	
		context.close();
	
	}

}
