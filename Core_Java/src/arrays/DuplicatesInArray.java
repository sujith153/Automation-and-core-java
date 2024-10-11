package arrays;

import java.util.Scanner;

public class DuplicatesInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int s = Integer.parseInt(sc.next());
		int arr[] = new int[s + 1];
		System.out.println("Enter elements in a single line with comma ");
		String num = sc.next();
		String[] n = num.split(",");

		for (int i = 0; i < arr.length - 1; i++)
			arr[i] = Integer.parseInt(n[i]);
		sc.close();
		int bh = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					bh = arr[i];
			}
		}
		System.out.println(bh);

	}

}
