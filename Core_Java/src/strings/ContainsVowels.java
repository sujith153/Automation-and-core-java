package strings;

public class ContainsVowels {
	public static void main(String[] args) {
		String name = "Sujith";
		String vowels = "aeiou";
	
		System.out.println(name.toLowerCase().matches(".*[aeiou].*")); // returns true if vowel is present

		System.out.println("Vowels contains in the string are :");
		// to print only vowels in a string
		for (Character c : name.toCharArray()) {
			if (vowels.indexOf(c) != -1)
				System.out.print(c);
		}

		System.out.println("\nAfter removing the vowels from the string : ");
		// To remove vowels from a string
		for (Character c : name.toCharArray()) {
			if (vowels.indexOf(c) == -1)
				System.out.print(c);
		}
	}

}
