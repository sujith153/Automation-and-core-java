package strings;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		//KA04 ND 8919
		String s1 = "Venkat";
		String s4 = "Sujith is a B.tech graduate";
		String s8 = "934941491";
		int s9 = s1.indexOf(s4);
		System.out.println(s9);
		String s2 = new String("Venkat");
		char[] name = {'v', 'e', 'n', 'k', 'a', 't'};
		String r = new String(name,2,2);
		String s3 = new String(name);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4.trim());
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(" Reddy"));
		System.out.println(s1 == s2);
		System.out.println(s1 == s4);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.startsWith("R"));
		System.out.println(s1.endsWith("R"));
		System.out.println(s1.contains("R"));
		System.out.println(s3.substring(3));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.equalsIgnoreCase(s3));
		String s5 = "25/03/2024";
		String s6[] = s5.split("/");
		System.out.println(Arrays.toString(s4.split(" ")));
		System.out.println(Arrays.toString(s6));
		System.out.println(s4.toCharArray());
		System.out.println(s1.substring(2, 4));
		System.out.println(s1.replace("at", "y"));
		System.out.println(s1.charAt(3));
		System.out.println(s8);
		System.out.println(Integer.valueOf(s8));
		System.out.println(r);
		
	}

}
