package com.practice;

import java.util.Scanner;

//Write a Java Program to find the second-highest number in an array.

public class SecondHighestNumber {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter String");

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println("num===" + num);

		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int largest = 0;
		int secondLargest = 0;

		for (int x = 0; x < arr.length; x++) {
			System.err.print(arr[x] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}	
		System.out.println("secondlargest" + secondLargest);
	}
}
