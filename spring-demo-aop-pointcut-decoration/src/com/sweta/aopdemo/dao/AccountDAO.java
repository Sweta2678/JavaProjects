package com.sweta.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.sweta.aopdemo.Account;

@Component
public class AccountDAO {
	
//	public void addAccount() {
//	public void addAccount(Account account) {
		public void addAccount(Account account,boolean vip) {
		System.out.println(getClass()+"Add Account - DB stuff");
	}
		
		public void addAccount22(Account account,boolean vip) {
			System.out.println(getClass()+"Add Account22 - DB stuff");
		}

	
}
