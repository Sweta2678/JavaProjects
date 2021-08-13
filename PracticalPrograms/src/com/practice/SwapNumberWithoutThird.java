package com.practice;

import java.util.Scanner;

public class SwapNumberWithoutThird {
	public static void main(String[] args) {
		System.out.println("Enter numbersss");
		Scanner sc = new Scanner(System.in);
		
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		
		int1 =int1+int2;
		int2=int1-int2;
		int1=int1-int2;
		
		System.out.println("int1"+int1);
		System.out.println("int2"+int2);


	}
}
