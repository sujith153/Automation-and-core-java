package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Occurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word : ");
		String word = sc.nextLine().toLowerCase();
		sc.close();
		System.out.println("Occurence of each letter : ");
		char[] let = word.toCharArray();
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		for (char c : let) {
			if (charCountMap.containsKey(c))
				charCountMap.put(c, charCountMap.get(c) + 1);
			else
				charCountMap.put(c, 1);
		}
		for (Character key : charCountMap.keySet())
			System.out.println(key + " = " + charCountMap.get(key));
	}
}
