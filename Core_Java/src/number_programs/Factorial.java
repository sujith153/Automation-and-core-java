package number_programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		int sum = 1;
		for (int i = 1; i <= temp; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
		System.out.println(factorial(num));
	}

	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}
}
