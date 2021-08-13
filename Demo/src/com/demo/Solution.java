package com.demo;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            counter++;
            String s = sc.nextLine();
            System.out.println(counter+" "+s);     
         }
	}

}
