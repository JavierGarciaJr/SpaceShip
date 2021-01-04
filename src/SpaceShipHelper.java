
public class SpaceShipHelper {
	public static final int SIZE = 3;
	/**
	 * prints a triangle
	 */
	public static void tri() {
		//loops SIZE*2-1 times
		for(int i = 1; i <= (SIZE*2)-1; i++) {
		//print SIZE * 2 -i spaces
			for(int j = 1; j <= (SIZE*2)-i; j++) {
				System.out.print(" ");
			}
		//print i /s
			for(int k = 1; k <= i; k++) {
				System.out.print("/");
			}
		//print 2*s
			for(int l = 1; l <= 2; l++) {
				System.out.print("*");
			}
		//print i \s
			for(int k = 1; k <= i; k++) {
				System.out.print("\\");
			}
		//print SIZE * 2 - i spaces
			for(int j = 1; j <= (SIZE*2)-i; j++) {
				System.out.print(" ");
			}
		//print new line
		System.out.println();
		}
	}
	/**
	 * creates a line
	 */
	public static void line() {
		//print +
		System.out.print("+");
		//loops SIZE * 2 times
		for(int i = 1; i <= SIZE*2; i++) {
			for(int j = 1; j <= 1; j++) {
		//print =		
				System.out.print("=");
		//print *
				System.out.print("*");
		}
		}
		//print +
		System.out.print("+");
		//print new line
		System.out.println();
	}
	/**
	 * creates the pattern on the space ship
	 */
	public static void pattern1() {
		//loop SIZE times
		for(int i = 1; i <= SIZE; i++) {
		//print |
			System.out.print("|");
		//print SIZE- i .s
			for(int j = 1; j <= SIZE - i; j++) {
				System.out.print(".");
				}
		//print i /\
				for(int k = 1; k <= i; k++) {
					System.out.print("/\\");
				}
		//print (SIZE - i) * 2 .s
				for(int l = 1; l <= (SIZE-i)*2; l++) {
					System.out.print(".");
				}
		//print i /\
				for(int k = 1; k <= i; k++) {
					System.out.print("/\\");	
				}
		//print SIZE - i .s
				for(int j = 1; j <= SIZE - i; j++) {
					System.out.print(".");
				}
		//print |
			System.out.print("|");
		//print new line
			System.out.println();
		}
	}
	/**
	 * creates a pattern on the space ship
	 */
	public static void pattern2() {
		//loop SIZE times
		for(int i = 1; i <= SIZE; i++) {
		//print |
			System.out.print("|");
		//print i - 1 .s
		for(int j = 1; j <= i-1; j++) {
			System.out.print(".");
		}
		//print -1 * i + SIZE + 1 \/ 
		for(int k = 1; k <= (-1*i)+SIZE+1; k++) {
			System.out.print("\\/");
		}
		//print 2 * i - 2 .s
		for(int l = 1; l <= 2*i-2; l++) {
			System.out.print(".");
		}
		//print -1 * i + SIZE +1 \/
		for(int k = 1; k <= (-1*i)+SIZE+1; k++) {
			System.out.print("\\/");
		}
		//print i - 1 .s
		for(int j = 1; j <= i-1; j++) {
			System.out.print(".");
		}		
		//print |
		System.out.print("|");
		//print new line
		System.out.println();
	}
}
}
