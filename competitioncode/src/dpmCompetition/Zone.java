package dpmCompetition;

/**
 * Zone object that is defined by lowerLeft coordinates and upperRight coordinates
 */
public class Zone extends Stringer {
	Coordinate lowerLeft;
	Coordinate upperRight;
	
	/**
	 * Constructor
	 */
	Zone() {
		lowerLeft = new Coordinate();
		upperRight = new Coordinate();
	}
}
