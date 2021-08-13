package com.clone;


public class mainMethod {
public static void main(String[] args) throws CloneNotSupportedException {
	Company c1 =new Company("Cignex");
	Employee e1 = new Employee("sweta", 20, c1);
	System.err.println(e1);
	
	
	Employee e2 = (Employee) e1.clone();
	System.out.println("emp 2"+e1.getCompany().getName());
	
	e2.getCompany().setName("Datamatics");
	System.out.println("e11"+e1.getCompany().getName());
	System.out.println("e11"+e2.getCompany().getName());
}
}
