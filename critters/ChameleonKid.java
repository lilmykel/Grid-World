import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.grid.Grid;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{

	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();

		Grid<Actor> gr = getGrid();
		
		Location loc = getLocation();
		Location front = getLocation().getAdjacentLocation(getDirection());
		Location behind = getLocation().getAdjacentLocation(getDirection() + 180);

		if (gr.isValid(front)) {
			Actor actorFront = getGrid().get(front);
			if (actorFront != null) {
				actors.add(actorFront);
			}
		}

		if (gr.isValid(behind)) {
			Actor actorBehind = getGrid().get(behind);
			if (actorBehind != null) {
				actors.add(actorBehind);
			}
		}

		return actors;			
		
	}




}