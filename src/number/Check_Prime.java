package number;

import java.util.Scanner;

public class Check_Prime {

	static boolean isPrime(int input) {
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Please enter the value :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		boolean value = isPrime(input);

		if (value == true)
			System.out.println("Prime value");
		else
			System.out.println("Not a Prime value");

	}
}
