package com.demo;

import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
	     
	     String strind1="Sweta";
	     String anotherString="Swetambar";

		    Scanner s = new Scanner(System.in);

		    Integer a = s.nextInt();
		    String  str = s.next();
		    System.out.print(a*2 +"\n"+ str);
		    
		    int len1 = strind1.length();
	        int len2 = anotherString.length();
	        int lim = Math.min(len1, len2);
	        char v1[] = strind1.toCharArray();
	        char v2[] = anotherString.toCharArray();

	        int ans=0;
	        int k = 0;
	        while (k < lim) {
	            char c1 = v1[k];
	            char c2 = v2[k];
	            if (c1 != c2) {
	                ans  = c1 - c2;
	                System.out.println("ans"+ans);
	            }
	            k++;
	        }
	        ans= len1 - len2;
	        System.out.println("ansssssss"+ans);

	}
	

}
