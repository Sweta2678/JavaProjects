package flatfileread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class flatreader {

	public static void main(String args[])
     {
//   	 declare variables

         String user = "";
         String PDLDate = "";
         String name = "";
         String PDLNum = "";
         String problemDesc = "test";
         String resolutionDesc = "test";
         String delim = ";";
         int recordCounter = 0;
      
         try {
//        	 open file
        	 Path file = Paths.get("D:/testfile2.txt");
        	 FileInputStream fstream = new FileInputStream("D:/testfile2.txt");
        	  DataInputStream in = new DataInputStream(fstream); 
//        	 while not eof
        	 while((str = in.readLine()) != null){
        		 
        	 }

//        	   read input
//        	   if end of set
//        	     format output
//        	     write output
//        	     clear variables
//        	   figure out which variable
//        	   store in correct variable
//        	 end-while
        	 
         }catch(Exception e) {
        	 
         }
         
         
         
         
     }
         
        /* try
         {
             Path file = Paths.get("D:/testfile2.txt");
             FileInputStream fstream = new FileInputStream("D:/testfile2.txt");
            // Get the object of DataInputStream
              DataInputStream in = new DataInputStream(fstream);  
             BufferedReader br = new BufferedReader(new InputStreamReader(fstream));  //Buffered Reader
             String inputLine = null;     //String
             StringBuffer theText = new StringBuffer();  //StringBuffer
//problem: output contains last record ONLY. program is cycling through the entire file, overwriting records until the end.
//add a for loop based on recordCounter
             for(recordCounter=0;recordCounter<10;recordCounter++)
             {
             while((inputLine=br.readLine())!=null)
             {
                 if(inputLine.toLowerCase().startsWith("from:"))
                 {

                   recordCounter = recordCounter++;      // commented out when I added recordCounter++ to the for loop
                     user = inputLine.trim().substring(5).trim();
                     System.out.println("user"+user);
                 }
                 else
                 if(inputLine.toLowerCase().startsWith("effective date"))
                 {

                     PDLDate = inputLine.trim().substring(15).trim();
                     System.out.println("PLDate"+PDLDate);
                 }
                 else
                 if(inputLine.toLowerCase().startsWith("to:"))
                 {

                     name = inputLine.trim().substring(3).trim();
                     System.out.println("name"+name);
                 }
                 else
                 if(inputLine.toLowerCase().startsWith("sir number"))
                 {

                     PDLNum = inputLine.trim().substring(12).trim();
                     System.out.println("PDLNum"+PDLNum);
                 }
             } 
             String lineForFile = (recordCounter + ";" + user + ";" + name + ";" + PDLNum + ";" + PDLDate + ";" + problemDesc + ";" + resolutionDesc + System.getProperty("line.separator"));
             try
             {
                 BufferedWriter out = new BufferedWriter(new FileWriter("testfileoutput.txt"));
                 out.write(lineForFile);
                 out.close();
             }
             catch (IOException e)
             {
                 System.out.println("Exception ");
             }
             //close for loop
             }   // close while
            System.out.println(recordCounter + "\n" + user + "\n" + name + "\n" + PDLNum + "\n" + PDLDate + "\n" + problemDesc + "\n" + resolutionDesc);
             System.out.println(recordCounter + ";" + user + ";" + name + ";" + PDLNum + ";" + PDLDate + ";" + problemDesc + ";" + resolutionDesc);
            
         } //close try
         catch (Exception e)
         {
             System.err.println("Error: " + e.getMessage());
         }
     }
*/
	
}
