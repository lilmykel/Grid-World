import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{

	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location loc = getLocation();
		Location front = get(loc.getAdjacentLocation(getDirection()));
		Location back = get(loc.getAdjacentLocation(getDirection() + 180));


		Actor actorFront = getGrid().get(loc.getAdjacentLocation(getDirection()));
		Actor actorBack = getGrid(). get(loc.getAdjacentLocation(getDirection() +180));
		
		if (actorFront != null) {
			actors.add(actorFront);
		} 
		if (actorBack != null) {
			actors.add(actorBack);
		}

		return actors;			
		
	}




}