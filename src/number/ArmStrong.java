package number;

import java.util.Scanner;
/*
 * An Armstrong number is one whose sum of digits raised to the power three equals the number itself. 
 * 371, for example, is an Armstrong number because 3**3 + 7**3 + 1**3 = 371.
 * 153=1**3 + 5**3 + 3**3 = 1+125+27 = 153.
 */
public class ArmStrong {

	static boolean isArmStrong(int input) {
		int sum = 0;
		int rem = 0;
		int temp = input;
		while (input > 0) {
			rem = input % 10;
			sum = sum + (rem * rem * rem);
			input = input / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		System.out.println("Please enter the value :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if (isArmStrong(input))
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}
