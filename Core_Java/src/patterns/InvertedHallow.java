package patterns;

import java.util.Scanner;

public class InvertedHallow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the triangle: ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				if(j==0 || j==i-1) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < n-i; j++) {
				if(j==0 || j==n-i-1) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}