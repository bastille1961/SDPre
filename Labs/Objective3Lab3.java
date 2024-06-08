public class Objective3Lab3 {

	public static void main(String[] args) {
		int first = 1 + (int) (Math.random() * 6);
		int second = 1 + (int) (Math.random() * 6);
		int third = 1 + (int) (Math.random() * 6);
		System.out.println("The first roll of the die presents the number: " + first);
		System.out.println("The second roll of the die presents the number: " + second);
		System.out.println("The third roll of the die presents the number: " + third);
		int sum = first + second + third;
		System.out.println("The sum of the first, second and third values is:" + sum);
	
	}

}