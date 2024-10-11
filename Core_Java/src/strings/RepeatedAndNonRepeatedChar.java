package strings;

public class RepeatedAndNonRepeatedChar {
	public static void main(String[] args) {
		String word = "sujith vardhan reddy";
		StringBuilder repeated = new StringBuilder();
		StringBuilder nonRepeated = new StringBuilder();
		StringBuilder duplicates = new StringBuilder();
		char[] d = word.toCharArray();

		// Find repeated characters
		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (d[i] == d[j] && repeated.indexOf(String.valueOf(d[i])) == -1) {
					repeated.append(d[i]);
				}
			}
		}

		// Find non-repeated characters
		for (int i = 0; i < word.length(); i++) {
			if (repeated.indexOf(String.valueOf(d[i])) == -1)
				nonRepeated.append(d[i]);
		}

		// To remove duplicates
		for (int i = 0; i < word.length(); i++) {
			if (duplicates.indexOf(String.valueOf(d[i])) == -1)
				duplicates.append(d[i]);
		}

		System.out.println("Repeated Characters: " + repeated);
		System.out.println("Non Repeated Characters: " + nonRepeated);
		System.out.println("After Removing duplicates: " + duplicates);
	}

}
