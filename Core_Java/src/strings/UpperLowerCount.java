package strings;

import java.util.Scanner;

public class UpperLowerCount {

	public static void main(String[] args) {
		System.out.print("Enter String : ");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		int upper = 0, lower = 0 , number = 0 ,special = 0 ;
		for (int i = 0; i < s1.length(); i++) {
			  char ch = s1.charAt(i);
	            if (ch >= 'A' && ch <= 'Z')
	                upper++;
	            else if (ch >= 'a' && ch <= 'z')
	                lower++;
	            else if (ch >= '0' && ch <= '9')
	                number++;
	            else
	                special++;
		}
		s.close();
		System.out.println("Upper count is " + upper);
		System.out.println("Lower count is " + lower);
		System.out.println("Digits count is " + number);
		System.out.println("Special count is " + special);
	}

}
