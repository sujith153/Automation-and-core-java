package interview;

import java.util.HashMap;
import java.util.Map;

public class PrintOnlyDuplicates {
	public static void main(String[] args) {
		String[] nameProvider = new String[] { "john", "cena", "Raj", "Ravi", "john", "Mark", "Ravi", "Han", "Joseph",
				"Jeevan", "john", "Jack" };
		Map<String, Integer> names = new HashMap<String, Integer>();
		for (String string : nameProvider)
			names.put(string, names.getOrDefault(string, 0) + 1);

		for (String string : names.keySet()) {
			if (names.get(string) > 1)
				System.out.println(string);
		}

		String name = "sujith vardhan reddy chennupalli";
		Map<Character, Integer> dup = new HashMap<Character, Integer>();
		for (Character c : name.toCharArray())
			dup.put(c, dup.getOrDefault(c, 0) + 1);

		for (Character ch : dup.keySet()) {
			if (dup.get(ch) > 1)
				System.out.print(ch + " ");
		}
	}

}
