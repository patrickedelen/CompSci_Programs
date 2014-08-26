import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
import info.gridworld.world.*;

public class SpinnerCritter extends Critter
{	
		World wrld = new World();
		public void processActors(ArrayList<Actor> actors)
		{
		    ArrayList<Location> locList = new ArrayList<Location>();
		    ArrayList<Actor> actorList = new ArrayList<Actor>();
		    if(actors.size()>0) {
					int r = (int)(Math.random()*(actors.size()-1));
			
					if (!(actors.get(r) instanceof Rock) && !(actors.get(r) instanceof Critter))
			    	{
			        	actors.get(r).removeSelfFromGrid();
			        	actors.remove(r);
			        	
			    	}  
								}
			    
			    
				for(Actor e: actors)
				{
				  	if(!(e instanceof Rock) && !(e instanceof Critter))
				  	{
				  		locList.add(e.getLocation());
				  		actorList.add(e);
				  		
				  	}
				}
				
				if(actorList.size()!=0){
					
					for(int x=0; x<actorList.size(); x++){
						if(x!=0)
							actorList.get(x).moveTo(locList.get(x-1));
						else
							actorList.get(x).moveTo(locList.get(actorList.size()-1));
					}
				}
		
		}
}

