package arrays;

import java.util.HashSet;
import java.util.Set;

public class Pairs {
	 public static void main(String[] args) {
	        int[] a = {1, 2, 3, 3, 2};
	        Set<Integer> s = new HashSet<>();
	        for (int num : a) {
	            s.add(num);
	        }
	        int n = 0;
	        for (int i : s) {
	            int count = 0;
	            for (int num : a) {
	                if (num == i) {
	                    count++;
	                }
	            }
	            n += i * (count / i);
	        }
	        System.out.println(n);
	    }

}
