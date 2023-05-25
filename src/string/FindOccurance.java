package string;

import java.util.HashMap;

public class FindOccurance {

	public static void main(String[] args) {
		String word = "java programming";

		char[] charr = word.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : charr) {
			if (hm.containsKey(ch))
				hm.put(ch, hm.get(ch) + 1);
			else
				hm.put(ch, 1);
		}

		System.out.println(hm);
	}

}
