package com.clone;

public class Employee implements Cloneable{

	private String name;
	private int age;
	private Company company;
	
	public Employee(String name, int age, Company company) {
		this.name = name;
		this.age = age;
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
	//shalow copy
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	//deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Employee emp = (Employee) super.clone();
		emp.company = (Company) company.clone();
		return emp;
	}
	

}
