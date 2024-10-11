package arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] a = { 1, 2, 23, 2, 3, 23, 32 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - i - 1];
			System.out.print(b[i] + " ");
		}

		String names[] = { "jasjcn", "dddvda", "dfddav" };
		String reverse[] = new String[names.length];

		for (int i = 0; i < names.length; i++) {
			reverse[i] = names[names.length - i - 1];
			System.out.print(reverse[i] + " ");
		}
	}

}
