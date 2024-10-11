package arrays;

import java.util.ArrayList;

public class Factors {
	public static void main(String[] args) {
		int x = 20;
		int d = 4;
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 20; i > 0; i--) {
			if (x % i == 0) {
				al.add(i);
			}
		}
		System.out.println(al);
		System.out.println(al.get(d - 1));

	}
}
