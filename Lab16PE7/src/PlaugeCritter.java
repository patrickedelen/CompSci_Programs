import java.util.*;
import java.awt.Color;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
public class PlaugeCritter extends Critter{

 public void act() 
 { 
		 if (getGrid() == null) 
		 	return;
		 	
	 ArrayList<Actor> actors = getActors(); 
	 processActors(actors); 
	 ArrayList<Location> moveLocs = getMoveLocations(); 
	 Location loc = selectMoveLocation(moveLocs); 
	 makeMove(loc); 
 } 

 public void processActors(ArrayList<Actor> actors) 
 { 
		 for (Actor a : actors) 
		 { 
		 	if (!(a instanceof Rock) && !(a instanceof BPCritter)) 
		 	a.setColor(Color.BLACK); 
		 } 
 } 

}