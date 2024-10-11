package patterns;

import java.util.Scanner;

public class HallowSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Square: ");
		int k = sc.nextInt();
		sc.close();
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= k; j++) {
//				System.out.print("* ");

				if (i == 1 || i == k || j == 1 || j == k)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

}
