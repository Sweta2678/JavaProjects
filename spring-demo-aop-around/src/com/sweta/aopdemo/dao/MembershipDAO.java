package com.sweta.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass()+"Add Account in MembershipDAO - DB stuff");
	}
	
	public boolean addSillyOne() {
		System.out.println(getClass()+"   addSillyOne in MembershipDAO - DB stuff");
		return true;
	}
}
