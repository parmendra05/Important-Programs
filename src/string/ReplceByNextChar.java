package string;

public class ReplceByNextChar {

	public static void main(String[] args) {
		String input = "abcde";

		String output = "";

		for (int i = 0; i < input.length(); i++) {

			output += (char) (input.charAt(i) + 1);
		}

		System.out.println(output);

	}

}
