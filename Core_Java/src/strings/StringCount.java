package strings;

import java.util.Scanner;

public class StringCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data : ");
		String s1 = sc.nextLine();
		sc.close();
		String s2[] = s1.split(" ");
		System.out.println(s1.length());//total char's in the String
		System.out.println(s2.length);//total words in a string
	}

}
