package number;

import java.util.Scanner;

public class NumberAdition {

	public static int adition(int num) {
		int sum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Please enter the value :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(" Your Reversed vaue is : " + adition(input));

	}

}
