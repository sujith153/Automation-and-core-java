package patterns;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of triangel: ");
		int x = sc.nextInt();
		sc.close();
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
