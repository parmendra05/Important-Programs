package number;

import java.util.Scanner;

public class PerfectNumber {
	/*
	 * perfect number, a positive integer that is equal to the sum of its proper
	 * divisors. Example : 6 =1,2,3 & 1+2+3 = 6 (Perfect Number) 
	 * But 9 = 1,3 & 1+3=4 (Not a perfect Number)
	 */
	public static void main(String[] args) {
		System.out.println("Please enter the value to check Perfect number :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(isPerfect(input));

	}

	static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum = sum + i;
		}
		if (sum == num)
			return true;
		else
			return false;
	}
}
