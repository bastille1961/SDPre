import java.util.Scanner;

public class Objective9Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection;

		while(true) {

	publicMenu();
		Selection = scanner.nextInt();

		if (selection == 1) {
			System.out.println("Hello Human");
		} else if (selection == 2) {
			System.out.println("Apples, Bananas, Coconuts");
		} else if (section == 3) {
			System.out.println("Goodbye");
			break;
		} else {
			System.out.println("If you want to say \"Hello Human\" or print the Menu, select 1. or 2.");
			}

		}

		scanner.close();

	}

	public static void printMenu() {
		System.out.println("_____Menu_____");
		System.out.println("1: Say Hello");
		System.out.println("2. List my favorite foods");
		System.out.println("3. Exit");
		System.out.println();

	}

}