import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import java.awt.Color;

import java.util.ArrayList;

public class BlusterCritter extends Critter{

	private int courage = 2;
	private static double DARKENING_FACTOR = 0.1;


	public void processActors(ArrayList<Actor> actors)
    {
  		int n = 0;

  		for (Actor actor : actors) {
  			if (actor instanceof Critter) {
  				n++;
  			}
  		}

        if (n < courage)
        {    
            lighten(); 
        } else {
        	darken();
        }

        return;    

    }

    public ArrayList<Actor> getActors()
    {
    	ArrayList<Actor> actors = new ArrayList<Actor>();

    	int n = 0;

    	Location loc = getLocation();
    	
    	for (int rows = loc.getRow()-2; rows<=2; rows++) {
    		for (int cols = loc.getCol()-2; cols<=2; cols++) {
    			loc = new Location(rows, cols);

    			if (getGrid().isValid(loc)) {
    				Actor actor = getGrid().get(loc);
    				
    				if (actor != null) {
    					actors.add(actor);
    				}
    			}
    		}
    	}

    	actors.remove(getLocation());

    	return actors;	
    	
    }

    private void darken() 
    { 
     Color c = getColor(); 
     int red = (int) (c.getRed() * (1 - DARKENING_FACTOR)); 
     int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR)); 
     int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR)); 
     setColor(new Color(red, green, blue)); 
    } 

    private void lighten() 
    { 
     Color c = getColor();
     int red = c.getRed();
     int green = c.getGreen();
     int blue = c.getBlue();

     if ((int) c.getRed() <= 230) {
      	red = (int) (c.getRed() * (1 + DARKENING_FACTOR)); 
      }
     if ((int) c.getBlue() <= 230) {
       	blue = (int) (c.getBlue() * (1 + DARKENING_FACTOR)); 
       }  
     if ((int) c.getGreen() <= 230) {
     	green = (int) (c.getGreen() * (1 + DARKENING_FACTOR)); 
     }
     
    
     setColor(new Color(red, green, blue)); 
    } 

}