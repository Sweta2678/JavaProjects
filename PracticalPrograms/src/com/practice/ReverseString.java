package com.practice;

import java.util.Scanner;
import java.util.*;

public class ReverseString {
	
public static void main(String[] args) {
	
	System.out.println("Enter String");
	
	Scanner sc = new Scanner(System.in);
	String s  = sc.next();
	System.out.println("s==="+s);
	
	char ch[] = s.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
	

	
	
	
}	
	
	

}
