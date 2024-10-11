package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		System.out.print("Enter size of the list : ");
		int len = sc.nextInt();

		System.out.println("Enter the element of List:");
		for (int i = 0; i < len; i++)
			a.add(sc.next());

		sc.close();
		System.out.println(a);
		ArrayList<String> duplicates = new ArrayList<>();

		for (String element : a) {
			if (duplicates.contains(element)) {
				int index = duplicates.indexOf(element);
				int count = Integer.parseInt(duplicates.get(index + 1));
				duplicates.set(index + 1, String.valueOf(count + 1));
			} else {
				duplicates.add(element);
				duplicates.add("1");
			}
		}
		System.out.println("Count of each word :");
		for (int i = 0; i < duplicates.size(); i += 2)
			System.out.println(duplicates.get(i) + " = " + duplicates.get(i + 1));

	}

}
