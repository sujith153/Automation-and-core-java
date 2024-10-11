package number_programs;

import java.util.Scanner;

public class NumbersDivisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range from : ");
		int fnum = sc.nextInt();
		sc.close();
		System.out.print(" to ");
		int lnum = sc.nextInt();
		System.out.print("Enter the number to divisibility");
		int num  = sc.nextInt();
		for (int i = fnum; i <=lnum ; i++) {
			if(i%num==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
