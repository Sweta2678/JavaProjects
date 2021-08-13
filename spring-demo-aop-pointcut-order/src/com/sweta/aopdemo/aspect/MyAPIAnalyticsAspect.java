package com.sweta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyAPIAnalyticsAspect {
	
	@Before("com.sweta.aopdemo.aspect.AopExpressions.forDaoPackageExceptGetterSetter()") 
	public void performanceAnalytics() {
		System.out.println("====>performance Analytics method");
	}
}
