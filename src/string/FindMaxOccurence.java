package string;

public class FindMaxOccurence {

	public static char findMaxOccurence(String input) {
		int[] charCount = new int[256];
		int maxCount = -1;
		char maxChar = ' ';

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			charCount[ch]++;

			if (charCount[ch] > maxCount) {
				maxCount = charCount[ch];
				maxChar = ch;
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		String str = "i love india ppppp";
		char maxOccurance = findMaxOccurence(str);

		if (maxOccurance == ' ')
			System.out.println("Max Occurance : white space ");
		else
			System.out.println("Max Occurance : " + maxOccurance);

	}

}
