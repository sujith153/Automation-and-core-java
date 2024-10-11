package number_programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check : ");
		int num = sc.nextInt();
		for (int i = 1; i <num; i++) {
			
		
		int tempnum = i;
		int digits = 0;
		int remain = 0;
		int sum = 0;
		sc.close();
		while (tempnum != 0) {
			tempnum = tempnum / 10;
			digits++;
		}
		tempnum = i;

		while (tempnum != 0) {
			remain = tempnum % 10;
			sum += Math.pow(remain, digits);
			tempnum = tempnum / 10;
		}
		if (i == sum) {
//			System.out.println("it is an arm strong number");
			System.out.print(i+" ");
			
		} 
//		else
//			System.out.println("it is not an armstrong number");
		}
	}
}
