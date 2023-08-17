package string;

public class RemoveVowels {

	public static void main(String[] args) {

		String input = "asdetuoptthhmcm";

		StringBuffer output = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' 
					|| input.charAt(i) == 'e' 
					|| input.charAt(i) == 'i' 
					|| input.charAt(i) == 'o'
					|| input.charAt(i) == 'u')
				continue;

			else
				output.append(input.charAt(i));
		}

		System.out.println(output);

	}

}
