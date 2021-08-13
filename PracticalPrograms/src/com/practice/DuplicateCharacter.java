package com.practice;

import java.util.Scanner;
import java.util.Spliterator;

public class DuplicateCharacter {

	public static void main(String[] args) {
		System.out.println("Enter String");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("str===" + str);

		char[] ch = str.toCharArray();
		int count = 0;
		System.out.println("Duplicate characters are:");
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}
	}
}
