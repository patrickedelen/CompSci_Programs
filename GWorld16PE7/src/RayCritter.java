import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
public class RayCritter extends Critter {
  public void processActors(ArrayList<Actor> dudes) 
  {
    Actor actor;
    if(dudes.size()!=0)
    {
    	
    	boolean a = true;
    	for(int i = dudes.size()-1; i>=0; i--)
    	{
    		actor= dudes.get(i);
    		if((actor instanceof Rock)|| (actor instanceof Critter))
    		{
    			dudes.remove(i);
    		}
    	}
        
    }
    if(dudes.size()!=0)
    {
    	actor = dudes.get((int)(Math.random() * dudes.size()));
    	actor.removeSelfFromGrid();
    }
  }

  public ArrayList<Location> getMoveLocations() {
    ArrayList<Location> moveLocs = new ArrayList<Location>();
    Location loc = getLocation();
    Grid grid = getGrid();

	if(grid.isValid(loc.getAdjacentLocation(Location.NORTHEAST)))
	{
		 Location NE= loc.getAdjacentLocation(Location.NORTHEAST);
    	 moveLocs.add(NE);
	}
	if(grid.isValid(loc.getAdjacentLocation(Location.SOUTHEAST)))
	{
		Location SE = loc.getAdjacentLocation(Location.SOUTHEAST);
		moveLocs.add(SE);
	}
	if(grid.isValid(loc.getAdjacentLocation(Location.SOUTHWEST)))
	{
		Location SW= loc.getAdjacentLocation(Location.SOUTHWEST);
		moveLocs.add(SW);
	}
	if(grid.isValid(loc.getAdjacentLocation(Location.NORTHWEST)))
	{
		Location NW = loc.getAdjacentLocation(Location.NORTHWEST);
		moveLocs.add(NW);
	}
    return moveLocs;
  }

  public void makeMove(Location loc) {
  	Grid grid = getGrid();
    if ((grid.get(loc))!=null) 
    {
      int col = (int)(Math.random() * getGrid().getNumCols());
      int row = (int)(Math.random() * getGrid().getNumRows());
      loc = new Location(col,row);
      while(grid.get(loc)!=null)
      {
      	col = (int)(Math.random() * getGrid().getNumCols());
      	row = (int)(Math.random() * getGrid().getNumRows());
      	loc = new Location(col,row);
      }
      moveTo(loc);
    } else {
      moveTo(loc);
    }
  }


}