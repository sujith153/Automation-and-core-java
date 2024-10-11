package number_programs;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		int one = 0;
		int two = 1;
		System.out.print("Fibanocci Series of first "+num + " numbers are :"+ one +", "+ two+ ", ");
		for (int i = 2; i < num; i++) {
			int next = one + two;
			one =two;
			two =next;
			System.out.print(next+ ", ");
		}
	}

}
