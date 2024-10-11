package strings;

import java.util.Scanner;

public class StringReversePalindrome {
	public static void main(String[] args) {
		System.out.println("Enter the word or sentence : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; --i)
			reverse = reverse + str.charAt(i);
		sc.close();
		System.out.println(reverse);

		if (str.equalsIgnoreCase(reverse))
			System.out.println("It is a palindrome");
		else
			System.out.println("not a palindrome");

//		StringBuilder sen = new StringBuilder(str);
//		System.out.println(sen.reverse());
	}
}
