
import java.awt.Color;
import java.util.Scanner;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class GWorld16PE7 {
    
    public static void main(String[] args) {
    	
    	ActorWorld world = new ActorWorld();
    	Scanner scan = new Scanner(System.in);
    	
    	int x = 0;

        Rock rocky = new Rock();
        rocky.setColor(Color.WHITE);

        PlaugeCritter plauge = new PlaugeCritter();
        plauge.setColor(Color.BLACK);
        
        RayCritter rc = new RayCritter();
        rc.setColor(new Color(255,200,200));
        
        SpinnerCritter sp = new SpinnerCritter();
        sp.setColor(new Color(200,150,0));
        
        System.out.println("Which Gridworld Critter would you like?\n");
        System.out.println("   1. Black Plague Critter"+
        	"\n   2. Ray Critter"+
        	"\n   3. Spinner Critter");
        x = scan.nextInt();
        scan.nextLine();
              
        if(x == 1)
        {
        	world.add(new Location(1,1), plauge);
        }
        else if(x == 2)
        {
        	world.add(new Location(1,1), rc);
        }
        else if(x == 3)
        {
        	world.add(new Location(1,1), sp);
        }
        world.add(new Location(0,0), rocky);
        world.show();
    }
}
