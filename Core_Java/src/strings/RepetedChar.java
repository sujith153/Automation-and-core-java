package strings;

import java.util.Scanner;

public class RepetedChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.next();
		char[] t = str.toCharArray();
		scanner.close();
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}

	}

}
