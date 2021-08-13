package com.sweta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoginAspect {

	//point cut declaration
	
	
	@Pointcut("execution(* com.sweta.aopdemo.dao.*.*(..))")
	private void forDAOpackage() {} //method has anyName
	
	//getter pointcut
	@Pointcut("execution(* com.sweta.aopdemo.dao.*.get*(..))") // pointcut declaration
	public void getters() {
		System.out.println("====>performance Analytics method");
	}
	
	//setter pointcut
	@Pointcut("execution(* com.sweta.aopdemo.dao.*.set*(..))") // pointcut declaration
	public void setters() {
		System.out.println("====>performance Analytics method");
	}
	
	//include package and exclude getters and setters using logical operators
	@Pointcut("forDAOpackage() && !( getters() || setters() )")
	public void forDaoPackageExceptGetterSetter() {}
	
	
	//@Before("forDAOpackage()") // pointcut declaration
	
	@Before("forDaoPackageExceptGetterSetter()") //combine pointcut applied
	public void beforeAddAccountAdvice() {
		System.out.println("====>Executinggg before advicee");
	}
	
	//@Before("forDAOpackage()") // pointcut declaration
	@Before("forDaoPackageExceptGetterSetter()") //combine pointcut applied
	public void performanceAnalytics() {
		System.out.println("====>performance Analytics method");
	}
	
	

}
