package strings;

import java.util.Scanner;

public class StringOccurance {
	public static void main(String[] args) {
		System.out.println("Type the scentence : ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println("Enter the letter or word to check occurence : ");
		Scanner s3 = new Scanner(System.in);
		char letter = s3.next().charAt(0);
		int count = 0;
		for (char i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == letter) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
		s3.close();
//		String word = "AAAAAABBBBBCCCDDDA";
//		char[] let = word.toCharArray();
//		for (int i = 0; i < let.length; i++) {
//			int c = 1;
//			for (int j = i + 1; j < let.length; j++) {
//				if (let[i] == let[j])
//					c++;
//				else
//					break;
//			}
//			System.out.println(let[i] + "= " + c);
//			i += c - 1;
//		}
	}
}
