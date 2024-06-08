public class Objective3Lab2 {
	public static void main(String[] args) {
		double base_leg = 4;
		double vertical_leg = 8;
		base_leg = base_leg * base_leg;
		vertical_leg = vertical_leg * vertical_leg;
		double both_legs = base_leg + vertical_leg;
		double hypotenuse = Math.sqrt(both_legs);
		System.out.println("The value of the hypotenuse is:" + hypotenuse);

	}

}