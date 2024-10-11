package arrays;

import java.util.Arrays;

public class RepeatingArray {
	public static void main(String[] args) {
		int n = 4;
		int arr[] = { 1, 2, 3, 4, 5 };
		int[] ar = new int[n * arr.length];
		for (int i = 0; i < ar.length; i++)
			ar[i] = arr[i % arr.length];
		System.out.println(Arrays.toString(ar));
	}

}
