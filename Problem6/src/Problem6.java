/*
 * John Matthews
 * Problem 6
 * What a program that outputs an image using static methods
 */
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prints the full image using static methods
		pyramid();
		System.out.println(); //a blank line is needed in between the two parts
		pyramid();
		vertical();
		lineBig(); //this is the reason that the big line got its own method
		pyramid();
		System.out.println(); //another space was needed
		pyramid();
		lineSmall(); //this is the reason that the small line got its own method
		vertical();
		vertical(); //two of them are needed
		lineSmall();
		lineSmall(); //two of them are needed
	}
	public static void lineSmall(){
		//prints a small line of stars
		System.out.println("    *****    ");
	}
	public static void lineBig(){
		//prints a big line of stars
		System.out.println("*************");
	}
	public static void pyramid(){
		//prints a pyramid of stars
		lineSmall();
		System.out.println("  *********  "); //this line doesn't need its own method as it is not repeated anywhere else
		lineBig();
	}
	public static void vertical(){
		//prints a message that has vertical lines in it
		System.out.println("* | | | | | *");
	}

}
