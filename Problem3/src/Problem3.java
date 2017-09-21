/*
 * John Matthews
 * Problem 3
 * Use methods to produce a message to output
 */
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displays the whole message using methods
		message(); //this displays the boxes
		topBottom(); //this is needed for the bottom of the message
	}
public static void topBottom(){
	//this is the top and bottoms of the both around the message
	System.out.println("//////////////////////");
}
public static void box(){
	//displays the box when put on top of each other
	topBottom();
	System.out.println("|| Victory is mine! ||");
}
public static void message(){
	//there are many boxes needed to be displayed, so this displays them
	box();
	box();
	box();
	box();
	box();
}
}
