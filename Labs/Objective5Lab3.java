import java.util.Scanner
public class Objective5Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userNum;

		System.out.println("Please enter a number: ");
		String userInput = Keyboard.nextline();
		userInput = 3;

		if (userInput <= 0) {
			System.out.println(userInput + "is not a postive number.");
		}

		else (userInput > 0) {
			System.out.println(userInput + "is a positive number.");
		}
	}

	scanner.close();

}