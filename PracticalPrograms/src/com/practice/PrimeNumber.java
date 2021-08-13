package com.practice;
//Write a Java Program to find whether a number is prime or not.

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.err.println("Enter values");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		boolean isPrime = true;

		if (num == 1 || num == 0) {
			isPrime = false;
		}

		if (num >= 2) {
			for (int i = 2; i < num / 2; i++) {
				int n = num % i;
				if (n == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println("isPrime");
		} else {
			System.out.println("is not Prime");

		}

	}
}
