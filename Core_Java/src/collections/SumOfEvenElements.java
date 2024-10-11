package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		System.out.print("Enter size of the list : ");
		int len = sc.nextInt();

		System.out.println("Enter the element of :");
		for (int i = 0; i < len; i++)
			a.add(sc.nextInt());

		sc.close();

		System.out.println(a);

		int sum = 0;
		for (int i = 1; i < len; i = i + 2)
			sum = sum + a.get(i);

		System.out.println("Sum of even elements in list : " + sum);
	}

}
