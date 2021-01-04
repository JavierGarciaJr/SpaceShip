/**
 * 
 * Main class for drawing the  space ship image
 *author @ Javier Garcia
 *
 */
public class SpaceShipMain {
	/**
	 * main method of the program calls bowie
	 * @param args
	 */
	public static void main(String[] args) {
		bowie();
	}
	/**
	 * calls all the methods in the helper class to build space ship
	 */
	public static void bowie() {
		//print a triangle 
		SpaceShipHelper.tri();
		//print a line
		SpaceShipHelper.line();
		//print first set of patterns
		SpaceShipHelper.pattern1();
		//print second set of patterns
		SpaceShipHelper.pattern2();
		//print a line
		SpaceShipHelper.line();		
		//print second set of patterns
		SpaceShipHelper.pattern2();		
		//print first set of patterns
		SpaceShipHelper.pattern1();
		//print a line
		SpaceShipHelper.line();		
		//print a triangle
		SpaceShipHelper.tri();		
	}
}
