import java.util.Scanner;
/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	
	public static void main (String [] args) {
		
		Scanner keyboard = new Scanner(System.in);//TASK #2 Create a Scanner object here 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1; // first test score
		int score2; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		double temp;//Task #2 declare a variable to hold the user�s temperature
		
		System.out.println("Input score 1: ");//Task #2 prompt user to input score1
		score1 = keyboard.nextInt();//Task #2 read score1 
		System.out.println("Input score 2: ");//Task #2 prompt user to input score2
		score2 = keyboard.nextInt();//Task #2 read score2 
		// Find an arithmetic average
		average = ((double)score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Enter another temperature");//Task #2 prompt user to input another temperature
		temp = keyboard.nextDouble();//Task #2 read the user�s temperature in Fahrenheit
		temp = (5.0/9.0)*(temp - 32); //Task #2 convert the user�s temperature to Celsius
		System.out.printf("Your temperature in Celsius is %.2f degrees\n", temp);//Task #2 print the user�s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}

