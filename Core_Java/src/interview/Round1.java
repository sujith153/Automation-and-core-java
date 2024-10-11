package interview;

import java.util.HashMap;
import java.util.Map;

public class Round1 {
	public static void main(String[] args) {

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
