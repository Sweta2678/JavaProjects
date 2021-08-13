package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerDemo {
	public static void main(String[] args) {
		List<Employee> emp  = new ArrayList<Employee>();
//		emp.add(new Employee(2, "s", "sk", 20, 20000));
//		emp.add(new Employee(7, "s", "pra", 25, 10000));
//		emp.add(new Employee(14, "s", "ak", 10, 15000));
//		emp.add(new Employee(23, "s", "bha", 5, 22000));

		Collections.sort(emp , new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1,Employee emp2) {
				return emp1.getName().compareTo(emp2.getName());
			}
			
		});
		
		System.out.println("emp"+emp);
		
	}
}
