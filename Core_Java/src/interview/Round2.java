package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Round2 {
	public static void main(String[] args) {
		String name = "Gspann";

		Map<Character, Integer> ocu = new HashMap<Character, Integer>();
		for (Character c : name.toCharArray()) {
			ocu.put(c, ocu.getOrDefault(c, 0) + 1);
		}

		for (Character c : ocu.keySet()) {
			System.out.println(c + " = " + ocu.get(c));
		}

		int[] arr = { 12, 354, 454, 532324, 3435,58 };
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}

}
