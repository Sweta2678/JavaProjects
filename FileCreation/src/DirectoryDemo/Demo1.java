package DirectoryDemo;

import java.io.File;
import java.util.Scanner;

public class Demo1 {
	public static void main(String args[]) {
	      System.out.println("Enter the path to create a directory: ");
	      Scanner sc = new Scanner(System.in);
	      String path = sc.next();
	      System.out.println("Enter the name of the desired a directory: ");
	      path = path+sc.next();
	      //Creating a File object path = path+sc.next();
	      File file = new File(path);
	      //Creating the directory
	      boolean bool = file.mkdir();
	      if(bool){
	         System.out.println("Directory created successfully");
	      }else{
	         System.out.println("Sorry couldn�t create specified directory");
	      }
	   }
}
