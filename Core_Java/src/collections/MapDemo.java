package collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		// here map is interface we create new hashtable or hashmap or linkedhashmap
		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(12, "twelve");
		map.put(11, "eleven");
		map.put(10, "ten");
		System.out.println(map);
		map.put(10, "Tenn");// Updating
		System.out.println(map);
		System.out.println(map.size());
		map.remove(10);// removing
		System.out.println(map);
		map.put(13, "thirteen");
		System.out.println(map);
		map.replace(13, "Thirteen");// updation or replace
		System.out.println(map);
		System.out.println(map.containsKey(13));
		System.out.println(map.containsValue("veahf"));
		System.out.println(map);
		map.putIfAbsent(15, "fifteen");
		System.out.println(map);

		System.out.println(map.get(12));

	}

}
