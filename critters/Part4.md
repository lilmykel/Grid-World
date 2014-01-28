Set 7:
	1. The Methods implemented in critter are act, getActors, getMoveLocations, processActors, selectMoveLocation, makeMove.
	2. The basic actions of all critters are getActors, getMoveLoactions, processActors, selectMoveLocation, makeMove.
	3. Yes, if the Critter class has a different way of getting actors.
	4. Critter could change its color to the actor. The acors could be destroyed by the critter. The actors can change to the critter's color.
	5. getMoveLocations, selectMoveLocation, makeMove. The critter has to get all of the possible locations in which it can move before it can do anything, then it must choose one of these locations, followed by actually moving there.
	6. Critter extends actor. As a result, it uses the default constructor that comes with actor.
Set 8:
	1. It causes a ChameleonCritter to act differently because the act method calls on all these other diffferent act methods. Although it doesn't override act, it overrides the processActors and makeMove.
	2. First off, the makeMove method will tell the critter to face the direction of which it's about to move. Then the super.makeMove will tell it to actually move to its new locaion.
	3 In order to make the ChameleonCritter drop flowers in its old location, you'll have to modify the makeMove method. Check to see if the critter moved to a new location and then use a variable to drop the flower in its previous position.
	4. It processes the same actors so there's no need to override the method.
	5. The Actor class.
	6. It accesses its own grid by calling the getGrid mehtod.
Set 9:
	1. Because there is no need to override it since in inherits the same behavior as the critter class.
	2. The only actors eaten are the ones in the front, left-front, and right-fron locations of the CrabCritter. Everything else will remain the same and stay untouched.
	3. The getLocationsInDirections contains directions that the CrabCritter uses to find which actors are near it that it can possibly eat.
	4. The points are [4,3 4,4 and 4,5].