package collections;

import java.util.HashSet;
import java.util.Set;

public class Interview {
	public static void main(String[] args) {
		String name = "Sujith Vardhan Reddy";
	    char[] chars = name.toCharArray();
	    Set<Character> uniqueChars = new HashSet<>();
	    for (Character character : chars) {
	    	uniqueChars.add(character);
		}
	    System.out.print(uniqueChars);
	}
	
}
