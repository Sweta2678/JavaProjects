package com.sweta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLoginAspect {

	@Before("com.sweta.aopdemo.aspect.AopExpressions.forDaoPackageExceptGetterSetter()") // combine pointcut applied
	public void beforeAddAccountAdvice() {
		System.out.println("====>Executinggg  AddAccount Advice");
	}

}
