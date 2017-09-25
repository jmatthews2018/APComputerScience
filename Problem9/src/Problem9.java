/*
 * John Matthews
 * Problem 9
 * Create a program to find the area of a trapezoid, and then print the area
 */

import java.util.Scanner; //We need to import the package

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First we must declare the needed variables
		Scanner in = new Scanner(System.in);
		double baseOne;
		double baseTwo;
		double height;
		double area;
		
		//Now we can ask the user for the two bases and the height
		System.out.println("Trapezoid area calculator");
		System.out.print("Enter height:");
		height = in.nextDouble();
		System.out.print("Enter the length of the bottom base:");
		baseOne = in.nextDouble();
		System.out.print("Enter the length of the top base:");
		baseTwo = in.nextDouble();
		
		in.close(); //This is needed after getting our input
		
		//The calculation of the area is next
		area = (baseOne + baseTwo) * height / 2.0; //A = (b1 + b2)h/2, so b1 + b2 must be done first and are therefore in ()
		
		//Finally, the answer is displayed
		System.out.println("Area = " + area);

	}

}
