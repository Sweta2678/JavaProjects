package com.practice;

import java.util.Scanner;

public class ReverseString3 {
 public static void main(String[] args) {
	System.out.println("Enter String");
	
	Scanner sc=  new Scanner(System.in);
	String str = sc.next();
	int length =str.length();
	
	String rev ="";
	for(int i=length-1;i>=0;i--) {
		rev = rev+ str.charAt(i);
	}
	System.out.print(rev);
}
}
