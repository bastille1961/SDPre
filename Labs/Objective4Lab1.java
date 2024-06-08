import java.util.Scanner;

public class Objective4Lab1 {

	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);

	String fname = "";
	String lname = "";
	String favoriteAnimal = "";
	String favoriteFood = "";
	String favoriteSong = "";

	System.out.println("Please enter your first name in the space provided.");
	String fname = scanner.keyboard();

	System.out.println("Please enter your last name in the space provided.");
	String lname = scanner.keyboard();

	System.out.println("What is your favorite animal? Please enter your response in the space provided.");
	String favoriteAnimal = scanner.keyboard();

	System.out.println("What is your favorite food? Please enter your response in the space provided.");
	String favoriteFood = scanner.keyboard();

	String.out.println("What is your favorite song? Please enter your response in the space provided.");
	String favoriteSong = scanner.keyboard();

	System.out.println("Thank you for completing this questionaire" + fname + lname + 
		"You seem to have great taste in that your favorite animal is a" + favoriteAnimal 
		", your favorite food is" + favoriteFood "and you like to listen to" + favoriteSong);

	scanner.close();

	}

}