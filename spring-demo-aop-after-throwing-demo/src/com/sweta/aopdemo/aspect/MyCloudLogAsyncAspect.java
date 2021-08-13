package com.sweta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component 
@Order(2)
public class MyCloudLogAsyncAspect {
	
	@Before("com.sweta.aopdemo.aspect.AopExpressions.forDaoPackageExceptGetterSetter()") // combine pointcut applied
	public void logToCloudAsync() {
		System.out.println("====>logToCloudAsync method");
	}
}
