package com.sweta.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sweta.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(DemoConfig.class);
		// get the bean from container
		TrafficFortuneService fortuneService = appContext.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("fortune service called");

		String data = fortuneService.getFortune();
		
		System.out.println("Datae :::"+data);
		
		appContext.close();
	}
}
