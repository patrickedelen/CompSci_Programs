
 import java.util.Scanner;
public class Lab20PE7 {
    private static AllRequests alR;
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
    	alR=new AllRequests();
    	boolean killMenu=false;
    	while(killMenu == false){
    		System.out.println("Choose a book!");
    		
    		System.out.println("1.\tGeneral Science");
    		System.out.println("2.\tPhysics");
    		System.out.println("3.\tChemistry");
    		System.out.println("4.\tGeneral English");
    		System.out.println("5.\tLiterature");
    		System.out.println("6.\tGeneral Math");
    		System.out.println("7.\tAlgebra");
    		System.out.println("8.\tGeometry");
    		System.out.println("9.\tAll Requests");
    		System.out.println("10.\tExit");
    		
    		int mC = scan.nextInt();
    		
    		Book b = null;
    		switch(mC) {
    			case 1: b=new Science("General Science");
    					alR.addBook(b);
    					System.out.println(b.getName()+" -- "+b.opinion()+".");
    					System.out.println("\n");
    				break;
    			case 2: b=new Physics("Physics");
    					alR.addBook(b);
    					System.out.println(b.getName()+" -- "+b.opinion()+".");
    					System.out.println("\n");
    				break;
    			case 3: b=new Chemistry("Chemistry");
    					alR.addBook(b);
    					System.out.println(b.getName()+" -- "+b.opinion()+".");
    					System.out.println("\n");
    				break;
    			case 4: b=new English("General English");
    					alR.addBook(b);
    					System.out.println(b.getName()+" -- "+b.opinion()+".");
    					System.out.println("\n");
    				break;
    			case 5: b=new Literature("Literature");
    					alR.addBook(b);
    					System.out.println(b.getName()+" -- "+b.opinion()+".");
    					System.out.println("\n");
    				break;
    			case 6: b=new Maths("General Math");
    					alR.addBook(b);
    					System.out.println(b.getName()+" -- "+b.opinion()+".");
    					System.out.println("\n");
    				break;
    			case 7: b=new Algebra("Algebra");
    					alR.addBook(b);
    					System.out.println(b.getName()+" -- "+b.opinion()+".");
    					System.out.println("\n");
    				break;
    			case 8: b=new Geometry("Geometry");
    					alR.addBook(b);
    					System.out.println(b.getName()+" -- "+b.opinion()+".");
    					System.out.println("\n");
    				break;
    			case 9: alR.allBooks();
    					System.out.println("\n");
    				break;
    			case 10: System.out.println("Exiting...");
    					killMenu=true;
    				break;
    			default: System.out.println("Error...Choose another");
    				break;
    				
    		}
    		
    	}
    }
}
