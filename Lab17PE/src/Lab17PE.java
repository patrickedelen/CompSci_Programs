/**
 * @(#)Lab17PE.java
 *
 * Lab17PE application
 *
 * @author 
 * @version 1.00 2014/3/19
 */
 
import java.util.Scanner;
public class Lab17PE {
    
    public static Scanner scan = new Scanner(System.in);
    
    //Arrays
    public static String[] name = {"John", "Jim", "Ann", "Lee", "Tim", "Sue", "Ben"};
    public static int[] age = {34, 53, 12, 9, 83, 20, 13};
    public static double[] pay = {13.6, 24.5, 37.9, 80.0, 15.25, 45.75, 150.90};
    
    public static void main(String[] args) {
    	
    	boolean keepAlive = true;
    	while(keepAlive == true) {
    	//Menu Print
    	System.out.println("What type of sort do you want?");
    		System.out.println("\tEnter 1 for name - Bubble Sort");
    		System.out.println("\tEnter 2 for age - Insertion Sort");
    		System.out.println("\tEnter 3 for pay - Selection Sort");
    		System.out.println("\tEnter 4 to Exit");
    	int menu = scan.nextInt();
    	
    	switch(menu){
    		
    		case 1: System.out.println("Bubble Sort");
    		break;
    		case 2: System.out.println("Insertion Sort");
    		break;
    		case 3: System.out.println("Selection Sort");
    		break;
    		case 4: System.out.println("Thanks for Sorting!");
    				keepAlive = false;
    		break;
    		
    		default : System.out.println("Error...Please make a valid selection");
    		break;
    	}
    
    
    	}
    
    }
}
