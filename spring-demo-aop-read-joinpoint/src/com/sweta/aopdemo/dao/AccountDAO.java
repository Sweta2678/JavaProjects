package com.sweta.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sweta.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;

//	public void addAccount() {
//	public void addAccount(Account account) {
	public void addAccount(Account account, boolean vip) {
		System.out.println(getClass() + "Add Account - DB stuff");
	}

	public void addAccount22(Account account, boolean vip) {
		System.out.println(getClass() + "Add Account22 - DB stuff");
	}

	public List<Account> findAccount() {
		List<Account> account = new ArrayList<Account>();
		Account ac1 = new Account("Sweta", "Gold");
		Account ac2 = new Account("prachi", "silver");
		account.add(ac1);
		account.add(ac2);
		return account;
	}

	public String getName() {
		System.out.println(getClass() + "get Name - ");

		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + "set Name -");

		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + "get ServiceCode - ");

		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + "set ServiceCode - ");

		this.serviceCode = serviceCode;
	}

}
