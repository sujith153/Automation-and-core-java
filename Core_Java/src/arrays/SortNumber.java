package arrays;

import java.util.Scanner;

public class SortNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
//		int num[] = { 32243, 43, 56, 76, 16, 6, 324 };
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
		System.out.println("Largest number in this array is :" + arr[n - 1]);
	}

}
