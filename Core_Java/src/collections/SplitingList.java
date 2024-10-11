package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitingList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> f = new ArrayList<>();
		System.out.print("Enter size of the list : ");
		int len = sc.nextInt();

		System.out.println("Enter the element of List:");
		for (int i = 0; i < len; i++) {
			f.add(sc.nextInt());
		}
		sc.close();
		System.out.println(f);
		
		System.out.println(f.subList(0, f.size()/2));
		System.out.println(f.subList(f.size()/2, f.size()));
	}

}
