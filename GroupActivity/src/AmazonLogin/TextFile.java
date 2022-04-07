package AmazonLogin;

import java.io.FileWriter;

public class TextFile {

	public static void main(String[] args) {
		         try{    
		           FileWriter fw=new FileWriter("C:\\Users\\salun\\eclipse-workspace\\GroupActivity\\Output\\Output.txt");    
		           fw.write("Welcome to Amazon");
		           fw.close();
		          }catch(Exception e){System.out.println(e);}    
		          System.out.println("Success...");    
		}  
}
