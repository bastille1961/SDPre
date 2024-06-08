import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		double dub1 = 0.0;
		double dub2 = 0.0;
		double dub3 = 0.0;
		int sum = num1 + num2 + num3;
		double dubSum = dub1 + dub2 + dub3;

		system.out.println("Please enter the first whole number you would like to add.");
		int num1 = scanner.nextInt();
		system.out.println("Please enter the second whole number you would like to add.");
		int num2 = scanner.nextInt();
		system.out.println("Please enter the third whole number you would like to add.");
		int num3 = scanner.nexInt();
		system.out.println("The sum of of three whole numbers entered is" + num1 "+" + num2 "+" + num3 "=" + sum);

		system.out.println("Please enter the first decimal number you would like to add.");
		double dub1 = scanner.nextDouble();
		system.out.println("Please enter the second decimal number you would like to add.");
		double dub2 = scanner.nextDouble();
		system.out.println("Please enter the third decimal number you would like to add.");
		double dub3 = scanner.nextDouble();
		system.out.println("The sum of the three decimal numbers entered is:" + dub1 "+" + dub2 "+" + dub3 "=" + dubSum);

		scanner.close();

	}



}