package arrays;

public class SumofNumsInMulti {

	public static void main(String[] args) {
		int[][] a = { { 2, 3, 5 }, { 3, 3, 3 } };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum = a[i][j] + sum;
			}
		}
		System.out.println(sum);
	}

}
