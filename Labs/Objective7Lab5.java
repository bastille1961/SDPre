public class Objective7Lab5 {
	public static void main(String [] args) {
		Scanner scann = new Scanner(System.in);
		int selection;

		while (true) {
			System.out.prinln("_____Menu_____");
			System.out.println("1: Say Hello");
			System.out.println("2: List My favorite foods");
			System.out.println("3: Exit");
			System.out.println();

			selection = scanner.nextInt();

			if (selection == 1) {
				System.out.println("Hello World");

			}

			else if (section == 2) {
				System.out.println("My favorite foods are: Apple, Banana and Coconut.");
			}

			else if (selection == 3) {
				break;
			}

			else {
				System.out.println("Invalid Selection: If you want to say \"Hello World\" or \"List your favorite foods\", select options 1 or 2.");
			
			scanner.close();
			}

			
		}

	}


















}