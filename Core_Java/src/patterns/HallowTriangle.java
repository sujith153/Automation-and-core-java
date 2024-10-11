package patterns;

import java.util.Scanner;

public class HallowTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Hallow triangel: ");
		int n = sc.nextInt();
		System.out.println("Enter number of hills to print: ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < num; k++) {
				for (int j = 0; j < n - i; j++) {
					System.out.print("  ");
				}
				for (int j = 0; j < i; j++) {
					if (j == 0 || i == n - 1) {
						System.out.print("* ");
					} else
						System.out.print("  ");
				}
				for (int j = 0; j < i + 1; j++) {
					if (j == i || i == n - 1) {
						System.out.print("* ");
					} else
						System.out.print("  ");
				}
				for (int j = 0; j < (n - i - 1); j++) {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
