package com.practice;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//Write a Java Program to iterate HashMap using While and advance for loop.


public class HashMapIterate {
	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<strArr.length;i++) {
			if(map.containsKey(strArr[i])) {
				int count = map.get(strArr[i]);
				map.put(strArr[i], count++);
			}
			else {
				map.put(strArr[i],1);
			}
			
			Iterator itr  = map.entrySet().iterator();
			while(itr.hasNext()) {
				Map.Entry me = (Map.Entry) itr.next();
				System.out.print(me.getKey() + "........"+me.getValue());
			}
			for(Map.Entry mee : map.entrySet()) {
				System.out.print(mee.getKey() + "....!!!!...."+mee.getValue());
			}
			
		}
		
	}

}
