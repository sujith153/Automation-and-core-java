package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		/*
		 * Set--> HashSet , LinkedHashSet , TreeSet, SortedSet , NavigableSet HashSet-->
		 * HashMap --> Array of Nodes(key,value) LinkedHashSet --> LinkedHashMAp -->Link
		 * of Nodes (key, value) TreeSet --> TreeMap--> binary Tree (Sorted Order)
		 * 
		 */
		HashSet<Integer> set = new HashSet<>();
		set.add(21);
		set.add(21);
		set.add(4);
		set.add(34);
		set.add(35);
		set.add(576);
		set.add(78);

		System.out.println(set);// It won't allow duplicates
		System.out.println(set.contains(32));
		System.out.println(set.remove(34));
		System.out.println(set.size());
		TreeSet<Integer> gh = new TreeSet<>();
		gh.add(313);
		gh.add(32);
		gh.add(3313);
		gh.add(45);
		gh.add(12);
		gh.add(4);
		gh.add(678);
		System.out.println(gh);
		System.out.println(gh.first());
		System.out.println(gh.last());
		int[] intArr = {32,32,43,3,43,43,4,4,124,214,12,42,142,};
		System.out.println(Arrays.toString(eliementDup(intArr)));

	}

	public static int[] eliementDup(int[] intArr) {
		HashSet<Integer> set = new HashSet<>();
		for (Integer integer : intArr) {
			set.add(integer);
		}
		int[] arr = new int[set.size()];
		int i = 0;
		for (int num : set) {
			arr[i++] = num;
		}
		return arr;
	}
}
