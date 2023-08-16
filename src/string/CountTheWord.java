package string;

import java.util.Scanner;

public class CountTheWord {

	static int wordCounter(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i)))
				count++;
		}
		return count + 1;
	}

	public static void main(String[] args) {

		System.out.println("Enter the sentences");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// First way
		System.out.println("Words : " + input.split(" ").length);

		// Second Way
		int words = wordCounter(input);
		System.out.println("Total words = " + words);

		sc.close();
	}

}
