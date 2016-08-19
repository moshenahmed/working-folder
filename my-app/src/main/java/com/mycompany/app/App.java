package com.mycompany.app;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Scanner text = new Scanner(System.in);
  System.out.print("Enter you name :");
    
      String nameinput = text.nextLine();
        for (int i = nameinput.length() - 1;  i >= 0; i--){
	  
	     System.out.print(nameinput.charAt(i));
	       }
	          
		    
		     }
}
