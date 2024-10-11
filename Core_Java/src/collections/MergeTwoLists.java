package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		System.out.print("Enter size of the 1st list : ");
		int len = sc.nextInt();

		System.out.println("Enter the element of 1st List:");
		for (int i = 0; i < len; i++)
			a.add(sc.nextInt());

		ArrayList<Integer> b = new ArrayList<>();
		System.out.print("Enter size of the 2nd list : ");
		int le = sc.nextInt();

		System.out.println("Enter the element of 2nd List :");
		for (int i = 0; i < le; i++)
			b.add(sc.nextInt());

		sc.close();

		ArrayList<Integer> e = new ArrayList<>();
		e.addAll(a);
		e.addAll(b);
		System.out.println("Combined list = " + e);
	}

}
