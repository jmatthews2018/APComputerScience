/*
 * John Matthews
 * Problem 5
 * Print a message using at least two static methods
 */
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prints the whole message using methods
		starBoth();
		System.out.println(); //A space is needed between this and the next output
		starBoth();
		starLine(); //An extra set of lines were needed under the last line
		System.out.println(); //same as before
		starVertical();
		starBoth();

	}
	public static void starLine(){
		//prints two rows of stars
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void starX(){
		//prints five stars in an X shape
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}
	public static void starBoth(){
		//prints both the lines and Xs together
		starLine();
		starX();
	}
	public static void starVertical(){
		//prints a vertical line of stars
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
	}

}
