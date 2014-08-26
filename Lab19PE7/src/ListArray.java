 import java.util.Scanner;
 import java.io.*;
 import java.util.ArrayList;
class ListArray {
	
	public static Scanner fileIn;
	public static BufferedWriter  writer;
	public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Integer> numbersPE = new ArrayList<Integer>();
    public static ArrayList<Integer> ascendPE = new ArrayList<Integer>();
    
	public static void make() {
	try
		{
			Scanner fileIn = new Scanner(new File("Lab19.txt"));
			

			int x = 0;
			while( fileIn.hasNext())
			{
				numbersPE.add(x,fileIn.nextInt());
				System.out.println(numbersPE.get(x));
				x++;
			}
		    fileIn.close();
		}catch(Exception e)
		{
			System.out.println("Input File Error!" + e);
		}
	}
	
	public static void order() {
    	int org;
    	int asc;
    	int spot;
    	
    	ascendPE.add(0,numbersPE.get(0));
    	
    	System.out.println(ascendPE.get(0));
    	
    	for(org=1; org<numbersPE.size(); org++) {
    	
    		spot=1;
			for(asc=0; asc<ascendPE.size(); asc++) {
				
				if(numbersPE.get(org)<ascendPE.get(asc)) {
					spot=asc;
				}
				if((asc==(ascendPE.size()-1))&&(numbersPE.get(org)>ascendPE.get(asc))){
					spot=spot++;
				}
    		}
    		ascendPE.add(spot,numbersPE.get(org));
    		System.out.println(ascendPE.toString());
    		
    	}
    	
    	
    }
	
	
	
}
