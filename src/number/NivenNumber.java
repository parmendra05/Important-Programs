package number;

import java.util.Scanner;

public class NivenNumber {
	/*
	 * In mathematics, a harshad number (or Niven number) in a given number base is
	 * an integer that is divisible by the sum of its digits. Example : 12 -> 1+2=3;
	 * & 12/3=0 (Remender should be zero) 18 -> 1+8=9; & 18/9=0 (Remender should be
	 * zero)
	 */

	static int sum(int input) {
		int sum = 0;
		int rem = 0;
		while (input > 0) {
			rem = input % 10;
			sum = sum + rem;
			input = input / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Please enter the value :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int adition = sum(input);

		if (input % adition == 0)
			System.out.println("Niven Number");
		else
			System.out.println("Not a Niven Number");
	}
}
