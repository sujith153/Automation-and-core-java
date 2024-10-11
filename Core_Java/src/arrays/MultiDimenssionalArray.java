package arrays;

import java.util.Scanner;

public class MultiDimenssionalArray {
	public static void main(String[] args) {
		int z[][] = {{2, 4, 7}, 
					 {5, 8, 9}};
		
		int x[][] = new int[2][3];
//		int y[][] = new int[2][3];
		System.out.println(z.length);
		System.out.println(z[0].length);
		
		for (int i = 0; i <z.length; i++) {
			for (int j = 0; j <z[i].length; j++) {
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println("Enter the numbers");
				x[i][j]= sc.nextInt();
			}
		}
		sc.close();
		for (int i = 0; i <x.length; i++) {
			for (int j = 0; j <x[i].length; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
