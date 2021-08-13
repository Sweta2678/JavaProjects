package com.demo;

import java.util.Scanner;

public class Positive {

	static boolean flag = Boolean.TRUE;
	static int B;
	static int H;
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if (B <= 0 || H <= 0) {
			flag = Boolean.FALSE;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}

	}

	public static void main(String[] args) {

		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}
