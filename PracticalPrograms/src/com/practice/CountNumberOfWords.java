package com.practice;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOfWords {
public static void main(String[] args) {
	
	System.out.println("Enter Numbers");
	Scanner sc = new Scanner(System.in);

	String str = sc.nextLine();

	System.out.println("str" +str);
	String[] strs = str.split(" ");
	
	HashMap<String, Integer> map = new HashMap<String,Integer>();
	
	for (int i=0;i <strs.length;i++) {
		if(map.containsKey(strs[i])) {
			int count = map.get(strs[i]);
			map.put(strs[i],count++);
		}
		else {
			map.put(strs[i], 1);
		}
		//System.out.print(map);
		System.out.print(map.size());
	}
	
	
	
}
}
