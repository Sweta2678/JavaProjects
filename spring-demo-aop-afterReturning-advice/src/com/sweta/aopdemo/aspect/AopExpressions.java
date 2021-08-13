package com.sweta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

	@Pointcut("execution(* com.sweta.aopdemo.dao.*.*(..))")
	public void forDAOpackage() {
	} 

	// getter pointcut
	@Pointcut("execution(* com.sweta.aopdemo.dao.*.get*(..))") // pointcut declaration
	public void getters() {
		System.out.println("====>performance Analytics method");
	}

	// setter pointcut
	@Pointcut("execution(* com.sweta.aopdemo.dao.*.set*(..))") // pointcut declaration
	public void setters() {
		System.out.println("====>performance Analytics method");
	}

	// include package and exclude getters and setters using logical operators
	@Pointcut("forDAOpackage() && !( getters() || setters() )")
	public void forDaoPackageExceptGetterSetter() {
	}

}
