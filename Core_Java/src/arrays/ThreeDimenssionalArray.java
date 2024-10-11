package arrays;

import java.util.Scanner;

public class ThreeDimenssionalArray {

	public static void main(String[] args) {
//		int x[][][] = {{{1,5,6},{2, 6, 8}},
//					   {{3,4,5}, {45, 67, 89}}};
		int y[][][] = new int[2][3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				for (int j2 = 0; j2 < y[i][j].length; j2++) {
					System.out.println("Enter numbers in order");
					y[i][j][j2] = sc.nextInt();
				}
			}
			
		}
		
		
//		System.out.println(x.length);
//		System.out.println(x[0].length);
//		System.out.println(x[0][0].length);
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				for (int j2 = 0; j2 < y[i][j].length; j2++) {
					System.out.print(y[i][j][j2]+" ");
				}
				System.out.print(",		");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
