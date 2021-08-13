package com.sweta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoginAspect {
	
	//add of our realted advice for logging
	
	//lets start with @Before advice
	//@Before("execution(public void com.sweta.aopdemo.dao.AccountDAO.addAccount())")
	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")
	//@Before("execution(* add*())")
	//@Before("execution(* add*(com.sweta.aopdemo.Account))") //passing parameters in method
	//@Before("execution(* add*(Account))") //need fully qualify name , else it will throw the error. - here error occuring
	//@Before("execution(* add*(com.sweta.aopdemo.Account ,..))") //match on any number of arguments - 0 to many params
	//@Before("execution(* add*(..))") //match on any number of arguments - 0 to many params
	@Before("execution(* com.sweta.aopdemo.dao.*.*(..))") //match package 
	public void beforeAddAccountAdvice() {
		System.out.println("Executinggg bfore advicee");
	}
	
}
