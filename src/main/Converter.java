package main;
import java.util.Scanner;

public class Converter {

	public static Scanner scan = new Scanner(System.in);
public static int menuSelection;


	public static void main(String[] args) {
		
		System.out.print("Please select an option:\n1. Cups to Teaspoons\n2. Miles to Kilometers\n3. US Gallons to Imperial Gallons\n4. Quit\n");
		while(menuSelection != 4) {
		
		      while (scan.hasNext()) {
		    	  if(scan.hasNextInt()) {
		      menuSelection = scan.nextInt();
		    	  switch (menuSelection) {
		    	  case 1:
		    		  System.out.println("How many cups do you have?\n");
		    		  int tea = scan.nextInt();
		    		  System.out.println(tea + " cups is "+ (tea*48)+" Teaspoons");
		    		  break;
		    	  case 2:
		    		  System.out.println("How many miles?\n");
		    		  int mil = scan.nextInt();
		    		  System.out.println(mil + " miles is precisely " + mil*1.609342 + " kilometers");
		    		  break;
		    		  
		    	  case 3:
		    		  System.out.println("How many US Gallons?\n");
		    		  int gal = scan.nextInt();
		    		  System.out.println(gal + " US Gallons is " + gal*0.832674 + " Imperial Gallons");
		    		  break;
		    		  
		    	  case 4:
		    		  System.out.println("You decided to quit. OK.");
		    		  break;
		    		  default:break;
		    		  
		    	  }
		      
		      }

		      // close the scanner
		      scan.close();
			
		}
		      
	}

}
}
