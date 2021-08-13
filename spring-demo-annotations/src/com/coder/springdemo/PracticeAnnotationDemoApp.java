package com.coder.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coachObj = context.getBean("pingPongCoach", Coach.class);
		
		System.out.println(coachObj.getDailyFortune());
		System.out.println(coachObj.getDailyWorkOut());
		
		context.close();
		
	}

}
