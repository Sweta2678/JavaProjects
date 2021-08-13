package com.sweta.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sweta.aopdemo.dao.AccountDAO;
import com.sweta.aopdemo.dao.MembershipDAO;

public class MainDemoApp {
	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from container
		AccountDAO accountDAO = appContext.getBean("accountDAO",AccountDAO.class);
		MembershipDAO membershipDAO = appContext.getBean("membershipDAO",MembershipDAO.class);

		Account acc = new Account();
		
		//call business method
		//accountDAO.addAccount(acc);
		accountDAO.addAccount(acc,true);
		accountDAO.addAccount22(acc, false);
		membershipDAO.addAccount();
		membershipDAO.addSillyOne();

		
		//close conetext
		appContext.close();
	}
}
