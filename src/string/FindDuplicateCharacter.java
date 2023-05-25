package string;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String str="welcome java";
		
		char[] charr=str.toCharArray();
		
		HashMap<Character, Integer>hm=new HashMap<>();
		
		for(char ch:charr) {
			if(hm.containsKey(ch)) hm.put(ch, hm.get(ch)+1);
			else hm.put(ch, 1);
		}
		
		System.out.println("all occurance are : \n"+hm);
		
		System.out.println("Duplicate values are -");
		Set<Character> charSet= hm.keySet();
		for(char ch:charSet) {
			if(hm.get(ch) >1) System.out.println(ch+" :"+hm.get(ch)+" times");
		}
		
		// for only one occurance
		System.out.println("Only one occurance are :");
		for(char ch:charSet) {
			if(hm.get(ch) ==1) System.out.println(ch+" :"+hm.get(ch)+" times");
		}
	}

}
