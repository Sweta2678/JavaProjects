package com.demo;

public class StaticDemo {

	static int i;  
    static  
    {  
        i=20;  
    }  
    static void print()  
    {  
        System.out.println(i);  
    }  
    public static void main(String[] args)  
    {  
        print();  
        i=200;  
        print();  
    }  
}
