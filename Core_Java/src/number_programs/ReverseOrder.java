package number_programs;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range from : ");
		int fnum = sc.nextInt();
		System.out.print(" to ");
		int lnum = sc.nextInt();
		sc.close();
		for (int i = fnum; i >= lnum; i--) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}

}
