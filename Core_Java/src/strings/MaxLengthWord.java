package strings;

import java.util.Scanner;

public class MaxLengthWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		String[] s1 = str.split(" ");
		String word = "";
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].length()>word.length()) {
				word = s1[i];
			}
		}
		System.out.println(word);
		scanner.close();
	}

}
