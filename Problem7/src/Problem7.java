/*
 * John Matthews
 * Problem 7
 * Print a text exactly in the format shown 
 */
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A \"quoted\" String is"); // \" used to display a double quote in a println
		System.out.println("     'much' better if you learn"); //\t is too big so spaces are used
		System.out.println("the rules of \"escape sequences.\""); //same as above for double quotes
		System.out.println("     Also, \"\" represents an empty String."); // \"\" = "" and \t cannot be used again as it is too big
		System.out.println("Don't forget: use \\\" instead of \" !"); // \\ = \ and \" = " so \\\" = \"
		System.out.println("     '' is not the same as \""); //\t is too big for what we need
				
	}

}
