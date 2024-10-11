package collections;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicatesInString {
	public static void main(String[] args) {
		String input = "Sujith Vardhan Reddy";
		String result = removeDuplicatesByMap(input.toLowerCase());
		System.out.println(result);
	}

	public static String removeDuplicatesByMap(String input) {
		HashMap<Character, Boolean> albhabet = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (!albhabet.containsKey(c)) {
				albhabet.put(c, true);
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static String removeDuplicatesBySet(String input) {
		HashSet<Character> dup = new HashSet<Character>();
		for (Character character : input.toCharArray()) 
			dup.add(character);
		return dup.toString();
	}

}
