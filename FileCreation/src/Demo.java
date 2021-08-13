import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {
	public static void main(String[] args) {
		
		
		
		/*
		 * //for the create directory using the neo files Path path =
		 * Paths.get("C:/Images"); try { Files.createDirectory(path); } catch
		 * (IOException e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 */
		
		//
		String directoryName = "C:\\Image3";
		File directory = new File(String.valueOf(directoryName));
		 if(!directory.exists()){
			 String path = "C:\\Image3";
			  File file = new File(path);
		      //Creating the directory
		      boolean bool = file.mkdir();
		      if(bool){
		         System.out.println("Directory created successfully");
		      }else{
		         System.out.println("Sorry couldn’t create specified directory");
		      }
		 }
		 else {
			 System.err.println("Directory already Exist");
		 }
		
		 
		
		
		//for create file
		/*
		 * File f = new File("C:\\Imagess"); // Check if the specified file // Exists or
		 * not if (f.exists()) { System.out.println("Exists"); } else {
		 * System.out.println("Does not Exists"); try { File file = new
		 * File("C:\\Imagess"); file.createNewFile(); boolean flag = file.mkdir();
		 * System.out.print("Directory created? " + flag); } catch (Exception e) {
		 * e.printStackTrace(); } }
		 */

	}
}