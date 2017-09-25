/*
 * John Matthews
 * Problem 8
 * Write a program that takes the radius of a sphere and outputs the sphere's diameter, circumference, 
 * surface area, and volume.
 */

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First I declare the variables I will be using
		Scanner in = new Scanner(System.in);
		double radius;
		double diameter;
		double circumference;
		double surfaceArea;
		double volume;
		
		//Then the user can input the radius of the sphere
		System.out.print("Enter radius:");
		radius = in.nextDouble();
		
		in.close(); //This statement is always needed after the input is over
		
		//Now the math behind the code can be done here
		diameter = radius * 2.0;
		circumference = diameter * 3.14;
		surfaceArea = radius * radius * 3.14 * 4.0; //Square function and pi function are unknown right now, so 3.14 is used for pi and square is done by multiplying the number by itself
		volume = radius * radius * radius * 3.14 * 4.0 / 3.0; //Same as above, but now with cubed so an extra radius is multiplied
		
		//Now the results are printed to the screen
		System.out.println("Diameter = " + diameter);
		System.out.println("Circumference = " + circumference);
		System.out.println("Surface Area = " + surfaceArea);
		System.out.println("Volume = " + volume);

	}

}
