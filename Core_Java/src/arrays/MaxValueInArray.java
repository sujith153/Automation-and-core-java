package arrays;

import java.util.Arrays;

public class MaxValueInArray {

	public static void main(String[] args) {
// For max int in an array 		
		int a[] = {9,433,245,324,7,32434,3412};
		Arrays.sort(a);
		System.out.println("Sorted Array: "+Arrays.toString(a));
		System.out.println("Largest Number in array: "+a[a.length-1]);
		System.out.println("Smallest Number in array: "+a[0]);
		int max = a[1];
		int index =0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
				index =i;
			}
			
		}
		System.out.println(max);
		System.out.println(index);
		

		
		
//For minimum length word in an array		
//		String b[] = { "uvuyv", "buyvy", "ihuvuyv", "vgjf", "ohdsiobhdoihvdnv" };
//
//		String v = b[1];
//		int max = 0;
//		for (int i = 0; i < b.length; i++) {
//			if (b[i].length() < v.length()) {
//
//				max = i;
//				v = b[i];
//
//			}
//
//		}
//		System.out.println(max);
//		System.out.println(v);

	}

}
