package com.sweta.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sweta.aopdemo.dao.AccountDAO;

public class AfterFinallyDemoApp {
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(DemoConfig.class);
		// get the bean from container
		AccountDAO accountDAO = appContext.getBean("accountDAO", AccountDAO.class);
		List<Account> listAccount = null;
		try {
			boolean thipWire =true;
			listAccount = accountDAO.findAccount(thipWire);

		} catch(Exception e) {
			System.out.println("Exception occur==============="+e);
		}
		
		System.out.println("Main:After throwiunggggg");

		System.out.println("\n");

		System.out.println("List" + listAccount);

		System.out.println("\n");


		appContext.close();
	}
}
