package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		System.out.println("Enter Words :");
		Scanner s = new Scanner(System.in);
		String words = s.nextLine();
		String[] word = words.split(" ");
		System.out.println(Arrays.toString(word));
		s.close();
		for (String w : word) {
			String reverse = "";
			for (int i = w.length() - 1; i >= 0; --i) {
				reverse = reverse + w.charAt(i);
		}
			System.out.print(reverse + " ");
		}
	}

}
