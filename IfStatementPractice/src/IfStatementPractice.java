/*
 * John Matthews
 * If statement practice
 * practice using if statements
 */
public class IfStatementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Two integer values being compared, two below are inputs
		int largestNumber = largest(5, 7);//Use the method to first the largest and store it in the variable
		System.out.println("The largest integer is " + largestNumber); //prints out the answer
		System.out.println("The quotient is " + quotientMain(10, 22) + "r. " + quotientRemainder(10, 22));
		//displays the answer for 4-1
		if(rightTriangle(3,4,6) == true){
			System.out.println("The triangle is a right triangle");
		}else{
			System.out.println("The triangle is not a right triangle");
		}
		System.out.println("The cost is $" + callCost(3.4));
	}
	public static int largest(int firstNum, int secondNum){ //number 2
		if(firstNum > secondNum){ 
			return firstNum; //Returns first number if it is bigger
		} else { // or if secondNum > firstNum
			return secondNum; //Returns second number 
		}
		
	}
	public static int quotientMain(int firstNum, int secondNum){ //4-1
		if(firstNum > secondNum){
			return firstNum / secondNum;
		}else{
			return secondNum / firstNum;
		}
	}
	public static int quotientRemainder(int firstNum, int secondNum){ //4-1 
		if(firstNum > secondNum){
			return firstNum % secondNum;
		}else{
			return secondNum % firstNum;
		}
	}
	public static boolean rightTriangle(int firstSide, int secondSide, int thirdSide){ //4-2
		if(firstSide*firstSide + secondSide*secondSide == thirdSide*thirdSide){
			return true;
		}else{
			return false;
		}
	}
	public static double callCost(double callLength){
		if(callLength <= 2.0){
			return 1.15;
		}else{
			double extraLength = callLength - 2;
			if(extraLength%1 == 0){
				return extraLength * 0.5 + 1.15;
			}else if(extraLength%1 >= 5){
				extraLength = (double) Math.round(extraLength);
				return extraLength * 0.5 + 1.15;
			}else{
				extraLength = extraLength + 0.5;
				extraLength = (double) Math.round(extraLength);
				return extraLength * 0.5 + 1.15;
			}
		}
	}

}
