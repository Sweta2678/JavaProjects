package com.sweta.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.sweta.aopdemo.Account;

@Aspect
@Component
@Order(1)
public class MyDemoLoginAspect {

	@Before("com.sweta.aopdemo.aspect.AopExpressions.forDaoPackageExceptGetterSetter()") // combine pointcut applied
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("====>Executinggg  AddAccount Advice");

		// display the method signature
		MethodSignature methodSign = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method Name :::" + methodSign);

		// display method arguments
		// get the arguments
		Object[] args = joinPoint.getArgs();

		// looping through all arguments
		for (Object tempArgs : args) {
			if (tempArgs instanceof Account) {
				// downcast ana print account specific stuff
				Account acc = (Account) tempArgs;
				System.err.println("acc name" + acc.getName());
				System.err.println("acc level" + acc.getLevel());
			}

		}
	}

}
