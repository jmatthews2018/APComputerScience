/* 
 * John Matthews
 * Problem 4
 * Display a rocket ship with a message in it using methods
 */
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this will display the whole ship
		cone();
		box();
		System.out.println("|Hello |"); //The center cannot be made with methods, so hand printed
		System.out.println("| World|"); //Same as above for the rest of the center
		box();
		cone();

	}
public static void cone(){
	//Used for the cone and bottom of the rocket ship
	System.out.println("   /\\   ");
	System.out.println("  /  \\  ");
	System.out.println(" /    \\ ");
}
public static void sides(){
	//used for the sides of the boxes
	System.out.println("|      |");
}
public static void topBottom(){
	//displays the top and bottom part of the box
	System.out.println("+------+");
}
public static void box(){
	//displays the full box part of the rocket ship
	topBottom();
	sides();
	sides();
	topBottom();
}
}
