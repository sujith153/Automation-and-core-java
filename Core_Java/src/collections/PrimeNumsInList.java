package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumsInList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range from : ");
		int fnum = sc.nextInt();
		System.out.print(" to ");
		int lnum = sc.nextInt();
		System.out.printf("Prime numbers from %d to %d are :", fnum, lnum);
		sc.close();
		ArrayList<Integer> f = new ArrayList<>();
		for (int j = fnum; j <= lnum; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0)
					count++;
			}
			if (count == 2)
				f.add(j);
		}
		System.out.println(f);
	}

}
