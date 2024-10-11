package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PossibleTexts {

	static void generatePermutations(String str, String prefix, List<String> results) {
		if (str.length() == 0) {
			results.add(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				generatePermutations(str.substring(0, i) + str.substring(i + 1, str.length()), prefix + str.charAt(i),
						results);
			}
		}
	}

	static void findAllPasswords(String str) {
		List<String> results = new ArrayList<>();
		String numericPart = "";
		String alphabeticPart = "";

		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				numericPart += ch;
			} else {
				alphabeticPart += ch;
			}
		}

		generatePermutations(alphabeticPart, "", results);

		List<String> finalResults = new ArrayList<>();
		for (String perm : results) {
			finalResults.add(numericPart + perm);
		}

		Collections.sort(finalResults);

		for (String result : finalResults) {
			System.out.print(result + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		findAllPasswords(input);
		sc.close();
	}

}
