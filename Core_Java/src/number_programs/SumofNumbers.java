package number_programs;

import java.util.Scanner;

public class SumofNumbers {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range from : ");
		int fnum = sc.nextInt();
		System.out.print(" to ");
		int lnum = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = fnum; i <= lnum; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
	}

}
