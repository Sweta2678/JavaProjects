package com.demo;

public class TestAnonymousOverride {

	public static void main(String[] args) {
		Parent p = new Parent() {
			public void display() {
				System.out.println("display in inner class");
			}
		};
		p.display();
	}
	
	
}
