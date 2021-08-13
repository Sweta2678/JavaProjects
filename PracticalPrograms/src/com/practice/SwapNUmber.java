package com.practice;

import java.util.Scanner;

public class SwapNUmber {
	public static void main(String[] args) {

		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);

		int val = sc.nextInt();
		int val2 = sc.nextInt();
		
		int temp;
		temp = val;
		val=val2;
		val2=temp;
		
		System.out.println(val);
		System.out.println(val2);


	}
}
