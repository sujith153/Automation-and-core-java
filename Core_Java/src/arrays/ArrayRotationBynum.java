package arrays;

import java.util.Arrays;

public class ArrayRotationBynum {

	public static void main(String[] args) {
		int[] a = { 12, 76, 99, 98, 896, 768, 976 };
		int d = 3;
		int[] b = new int[d];
		int[] c = new int[a.length - d];
		int[] fin = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i + d];
		}
		for (int i = 0; i < c.length; i++) {
			fin[i] = c[i];
		}
		for (int i = 0; i < b.length; i++) {
			fin[i + c.length] = b[i];
		}
		System.out.println(Arrays.toString(fin));

	}

}
