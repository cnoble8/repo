import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) {
		
		String input;
		char answer;
		Scanner keyboard = new Scanner(System.in);// new Scanner object
		
		Movie one = new Movie(); // new movie object
		
		do {
			System.out.println("Enter the title of a movie: ");
			
			String title = keyboard.nextLine(); // save user input as title 
			one.setTitle(title); //pass string object as movie object title
			
			System.out.println("Enter the rating of the movie: "); // ask user for rating
			
			String rating = keyboard.nextLine();// save user input as rating
			one.setRating(rating);//pass string object as object rating
			
			System.out.println("Enter the number of tickets sold for this movie: ");// ask user for number of tickets sold
			
			int tickets = keyboard.nextInt();//save user input as object tickets
			one.setSoldTickets(tickets);
			
			keyboard.nextLine(); //consume the remaining newline, in case
			
			System.out.println(one.toString()); // print and call movie method 
			System.out.println("Do you want to enter another movie? ( y or n)");// ask user if they wish to continue
			input = keyboard.nextLine(); // save user input as string object
			answer = input.charAt(0); // save the first Character as the answer
			
		} while (answer == 'y' || answer == 'Y'); // loop will continue until answer equals n
		
		  System.out.println("Goodbye!");

	}

}
