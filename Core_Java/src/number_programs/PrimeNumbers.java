package number_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range from : ");
		int fnum = sc.nextInt();
		System.out.print(" to ");
		int lnum = sc.nextInt();
		System.out.printf("Prime numbers from %d to %d are :", fnum, lnum);
		sc.close();
		ArrayList<Integer> pnum = new ArrayList<Integer>();
		for (int j = fnum; j < lnum; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.print(j + " ");
				pnum.add(j);
			}
		}
		System.out.println();
		System.out.printf("Number of prime numbers from %d to %d are : ", fnum, lnum);
		System.out.println(pnum.size());
	}
}