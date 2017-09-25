/*
 * John Matthews
 * Problem 10
 * Write a program that determines how much an individual man or woman should weight based on his or her height
 */

import java.util.Scanner; //This package must be imported to use
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// First our variables are declared
		Scanner in = new Scanner(System.in);
		int height;
		int male;
		int female;
		
		//Input is entered right here
		System.out.print("Enter height in inches:");
		height = in.nextInt();
		
		in.close(); //This statement is needed
		
		//Calculations are done next. First is for men
		male = (height - 60) * 7 + 106; 
		//We know that the first 60 inches is 106 pounds, so we add that at the end,
		//but we need to subtract 60 from our base height to know how many 'extra' inches to multiply by 7
		
		female = (height - 60)* 6 + 100;
		//Same as above, but each additional pound is now multiplied by 6 and only 100 are added.
		
		//We can now display our answers
		System.out.println("\nRecommended Male Weight: " + male); //A \n is added to create a new line and make it look cleaner
		System.out.println("Recommended Female Weight: " + female);

	}

}
