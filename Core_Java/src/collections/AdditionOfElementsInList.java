package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionOfElementsInList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		System.out.print("Enter size of the list : ");
		int len = sc.nextInt();

		System.out.println("Enter the element of :");
		for (int i = 0; i < len; i++) {
			a.add(sc.nextInt());
		}
		sc.close();
		int sum = 0;
		for (Integer i : a)
			sum = sum + i;

		System.out.println(a);
		System.out.println("Sum of elements in the list : " + sum);
		double d = (double) sum / a.size();
		System.out.println("Average of the elements : " + d);

	}

}
