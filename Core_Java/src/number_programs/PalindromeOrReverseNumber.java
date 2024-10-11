package number_programs;

import java.util.Scanner;

public class PalindromeOrReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int temp = number;
		int sum = 0;
		sc.close();
		while (temp != 0) {
			int remain = temp % 10;
			sum = sum * 10 + remain;
			temp = temp / 10;
//			System.out.print("reversed number :"+r);
		}
		if (number == sum) {
			System.out.println(number + " is a palindrome");
		} else
			System.out.println(number + " is not a palindrome");
	}

}
