package collections;

import java.util.*;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Jashu");
		v.add("Jashu");
		v.add("Jashvewnkvneu");
		v.add("Hodor");
		v.add("dvnkd");
		v.add("Jashu");
		v.add("Jashu");
		v.add("svnkld");
		v.add("dvhbv");
		v.add("Jashu");
		v.add("Jashu");
		v.add(1,"Vishnu");
		v.add("Jashu");
		Vector<String> y = new Vector<>();
		y.add("KSKcsn");
		y.add("dkkda");
		v.addAll(y);// v.addAll(1,y)
		v.remove(2);
		v.remove("svnkld");
		v.set(2, "Arya");
		Object[] arr =y.toArray();
		Object[] arr1 = new Object[] {1,3,3,3,244,4,343,42424,2};
		Vector<Object> z = new Vector<Object>(Arrays.asList(arr1));
		System.out.println(z);
		System.out.println(Arrays.toString(arr));
		System.out.println(v);
		System.out.println(v.get(4));
		//Array list is same as vector but capacity is increased by 50 percent
		//Arraylist is Asynchronous
		
	}

}
