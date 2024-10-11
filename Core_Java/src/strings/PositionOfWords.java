package strings;

import java.util.Scanner;

public class PositionOfWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		String[] s1 = str.split(" ");
		scanner.close();
		for (int i = 0; i < s1.length; i++) {
			if(i%2==1) {
				System.out.print(s1[i]+" ");
			}
		}
	}

}
