/**
 * Programmer:			
 * Version:			Java 1.6 using JCreator v4.5
 * CS:				Period 
 * Date Created:		3/4/2010
 * Last Update:		3/4/2010
 * 
 * Project Filename:	IOhasNextEx
 * Program Filename(s):	IOhasNextEx.java
 * I/O Files used:		
 * I/O Files changed:	
 * 
 * Function: Input from a file using 
 *			1.  hasNext()
 *			2.  .split() with the delimiter "token" as a parameter
 *			3.  an array who's size is determined by the number of splits
 * 
 * Formulas: 
 * 
 * Algorithm:
 *	1. 
 *
 */
import java.util.Scanner;
 import java.io.*;
 import java.text.DecimalFormat;

public class IOhasNextEx
{
	public static int arrSize;
	public static double[] avg;
	public static int[] grade1;
	public static int[] grade2;
	public static char[] letterGrade;
	public static String[] name;
	public static String[] gender;
	public static Scanner fileIn;
	public static BufferedWriter  writer;
	public static Scanner scan = new Scanner(System.in);
	
	//////////////////////////////////////////////////
	//Input from a file using 
 	//	1.  hasNext()
 	//	2.  .split() with the delimiter "token" as a parameter
 	//	3.  an array who's size is determined by the number of splits
 	//Output to another file
	//////////////////////////////////////////////////
	public static void main(String[] args)
	{
		try
		{
			// define the file as input
			Scanner fileIn = new Scanner(new File("IOex.txt"));
			
			// create the strs array without determining its size
			String lineOfText;

			// determine how many lines of text are in the file
			int x = 0;
			while( fileIn.hasNext())
			{
				lineOfText = fileIn.nextLine();
				x++;
			}
		    fileIn.close();	
		    	
			avg = new double[x];
			grade1 = new int[x];
			grade2 = new int[x];
			letterGrade = new char[x];
			name = new String[x];
			gender = new String[x];
			
			// define the file as input
			Scanner fileInAgain = new Scanner(new File("IOex.txt"));
			String[] strs;
			// loop through the input file until there's no more lines
			int i = 0;
			while( fileInAgain.hasNext())
			{
				// assign the current line of info in the file to the
				// strs array, each element delimited by the item it's 
				// searching for in the split method's parameter
				strs = fileInAgain.nextLine().split(", ");
				name[i] = strs[0];
				// also change the item from a String to an int
				grade1[i] = Integer.parseInt(strs[1]);	
				grade2[i] = Integer.parseInt(strs[2]);
				gender[i] = strs[3];
				i++;
			}
			fileInAgain.close();
		}
		catch(Exception e)
		{
			System.out.println("Input File Error!" + e);
		}
		
		// output everything to both the screen and the Oexdw.txt file
		try
		{
			writer = new BufferedWriter(new FileWriter("Oexdw.txt"));
			System.out.println("\t\t\t\tSTUDENT LIST");
			writer.write("\t\t\t\t\t\t\t\tSTUDENT LIST\n");
			System.out.println();
			writer.write("\n");
			System.out.println("STUDENT    \t\tGRADE ONE\tGRADE TWO\tGENDER");
			writer.write("STUDENT\t\t\t\tGRADE ONE\t\tGRADE TWO\t\tGENDER\n");
			System.out.println("-----------------------------------------------"+
				"-------------------------------");
			writer.write("-----------------------------------------------"+
				"-----------------------\n");
			int p = 0;
			for(int i=0;i<10;i++)
			{
				
				while(name[i].length()<20)
				{
					name[i] = name[i].concat(" ");
				}
	
				// print to the screen
				System.out.println(name[i] + "\t" + grade1[i] + "\t\t"+ grade2[i] 
					+ "\t\t" + gender[i]);
					
				// output to the file
				writer.write(name[i] + "\t" + grade1[i] + "\t\t   " +
				grade2[i]+ "\t\t\t     "+ gender[i]+"\n");
				p++;
				
			}
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println("Output File Error! " +e);
		}
	}
}