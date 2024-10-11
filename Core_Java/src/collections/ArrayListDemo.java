package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		int[] arf = {32,3,43,4,4,45,42,43,53,5,23,32};
		a.add("Sujith");
		a.add("Jashu");
		System.out.println(a);
		a.add("jhd");
		a.set(2, "Jhon");
//		a.add(String.valueOf(Arrays.toString(arf)));
		a.add(Arrays.toString(arf));
		a.add(3, "rvg");
		System.out.println(a);
		
		System.out.println(Arrays.toString(arf));
		
	}
}
