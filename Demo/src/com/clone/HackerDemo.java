package com.clone;

import java.util.Scanner;

public class HackerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
       
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //formatting
                System.out.printf("%-14s %03d\n", s1, x);
                System.out.println(String.format("%-15s",s1) + String.format("%03d",x));   
                
            }
           
        System.out.println("================================");

	    }


}
