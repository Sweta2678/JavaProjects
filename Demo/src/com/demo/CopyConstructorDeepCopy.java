package com.demo;

public class CopyConstructorDeepCopy {

	public static void main(String[] args) {
		Company c1 =new Company("Cignex");
		Employe e1 = new Employe("sweta", 20, c1);
		System.err.println(e1);
		
		
		Employe e2 = new Employe(e1);
		System.out.println("emp 2"+e1.getCompany().getName());
		
		e2.getCompany().setName("Datamatics");
		System.out.println("e11"+e1.getCompany().getName());
		System.out.println("e11"+e2.getCompany().getName());

		
	}
}
