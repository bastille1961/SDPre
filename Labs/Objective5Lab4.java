import java.util.Scanner
	Public class Objective5Lab4 {
		Public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			int num1 = 6;
			int num2 = 7;
			int userNum = 0;

			System.out.println("An even number is an integer that can be divided exactly by 2 and leaves no remainder.");
			System.out.println("This script will determine whether a number is odd or even when divided by 2 as evidenced by a non-zero remainder ");

			if(num1 % 2 == 0) {
				System.out.println(num1 + "is an even number. ");
			}

			else !(num1 % == 0) {
				System.out.println(num1 + "is an odd number. ");
			}

			if(num2 % 2 == 0) {
				System.out.println(num2 + "is an odd number. ");
			}

			else !(num2 % 2 == 0) {
				System.out.println(num2 + "is an even number. ");
			}
			
			System.out.println("Now, you try; pick a number: ");
			int userNum = scanner.nextInt();

			if (userNum %  2 == 0) {
				System.out.println("The number you entered" + userNum + "is an even number. ");
			}

			else !(userNum % 2 ==0) {
				System.out.println("The number you entered: " + userNum + "is not an even number. ");
			}
		}

		scanner.close();

	}