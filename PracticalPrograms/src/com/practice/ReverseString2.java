package com.practice;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner sc =new Scanner(System.in);
		
		String str = sc.next();
		String[] token = str.split("");
		for(int i=token.length-1;i>=0;i--) {
			System.out.print(token[i]);
		}
			
		
	} 
}
