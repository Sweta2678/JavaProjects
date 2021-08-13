package com.code.springmvcdemo.controller.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstrainValidator.class) //which class 
@Target({ElementType.METHOD,ElementType.FIELD}) //where this annotation used.can be apply on field or method.
@Retention(RetentionPolicy.RUNTIME)   //how long mark annotation going to use. ..runtime by jvm.
public @interface CourseCode { //it is annotation 
	
	//define default course code
	public String value() default "LUV";
	
	//define default error message
	public String message() default "must start with LUV";
	
	//define default groups
	public Class<?>[] groups() default{};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
	
}
