import java.util.Scanner;

public class Objective4Lab3 {
	public static void main(String[] args) {
		int birthYear, age = 0, currentYear = 2024; //Current as of this script

		Scanner keyboard = new Scanner(System.in);

		System.out.println("How old are you? Please enter your age in the space provided.");
		int age = scanner.nextInt();
		int birthYear = currentYear - age;		
		System.out.println("You were born in " + birthYear);

		scanner.close();

	}

}