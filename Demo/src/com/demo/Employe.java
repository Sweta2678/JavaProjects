package com.demo;

public class Employe {

	private String name;
	private int age;
	private Company company;
	
	
	public Employe(String name, int age, Company company) {
		this.name = name;
		this.age = age;
		this.company = company;
	}
	
	//copy Construcotr
	public Employe(Employe emp) {
		this.name = name;
		this.age = age;
		Company company = new Company(emp.company.getName());
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + ", company=" + company + "]";
	}
	
	
}
