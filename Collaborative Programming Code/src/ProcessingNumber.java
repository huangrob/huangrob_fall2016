// import java util
import java.util.Scanner;

//Robert Huang
//Due: 10/3/16
//Period 1
//Collaborative Programming Code

public class ProcessingNumber {
	public static void main(String[] args) {
		// Makes a new Scanner
		Scanner userInput = new Scanner(System.in);
		System.out.println("This program determines your largest number, smallest number, largest even number, and the sum of the even numbers.");
		System.out.println("How many integers do you want to enter?");
		int totalNumbers = userInput.nextInt();
		// Declares min as the largest integer value possible
		// Ensures that the user's input is smaller than the initialized integer
		int min = Integer.MAX_VALUE;
		// Declares max and maxEven as the smallest integer value possible
		// Ensures that the user's input is larger than the initialized integer
		int max = Integer.MIN_VALUE;
		int maxEven = Integer.MIN_VALUE;
		int sumEven = 0;
		// For loop that runs for the number of inputs
		for(int i = 1; i <= totalNumbers; i++){
			System.out.println("Enter your integer: ");
			int userNum = userInput.nextInt();
			if (userNum > max){
				max = userNum;
			}
			if(userNum < min){
				min = userNum;
			}
			if(userNum % 2 == 0){
				sumEven += userNum;
				if(userNum > maxEven){
					maxEven = userNum;
				}
			}
		}
		// Prints out all the information
		System.out.println("\nThe largest number: " + max);
		System.out.println("The smallest number: " +  min);
		System.out.println("The sum of all even numbers: " + sumEven);
		System.out.println("The largest even number: " + maxEven);
	}
}
