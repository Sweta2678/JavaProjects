package com.demo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;	

public class Currency {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();

	        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
	    
	        
	        System.out.println("US: " + us);
//	        System.out.println("India: " + india);
//	        System.out.println("China: " + china);
//	        System.out.println("France: " + france);
	    }
}
