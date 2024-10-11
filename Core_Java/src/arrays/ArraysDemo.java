package arrays;

import java.util.Scanner;

public class ArraysDemo {
	
	public static void main(String[] args) {
//		int x = 10;
		int y[] = new int[5];
//		int z[] = {2, 4, 7, 9, 10};
		
//		for (int i : z) {
//			System.out.println(i);
//		}
		
//		System.out.println("Size of Z::"+z.length);
//		System.out.println(z[0]);
//		System.out.println(z[4]);
		
//		for (int i = 0; i < z.length; i++) {
//			System.out.println(z[i]);
//		}
		Scanner scanner = new Scanner(System.in);
		
		for (int j = 0; j < y.length; j++) {
			System.out.println("Enter  number ");
			y[j] = scanner.nextInt();
		}
		
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
		scanner.close();
	}

}
