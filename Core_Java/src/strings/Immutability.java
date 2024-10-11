package strings;

public class Immutability {
	public static void main(String[] args) {
		/*
		 * ***Why String is immutable ?
		 * Main reason is for security
		 * -> When you perform operations on strings, such
		 * as concatenation, a new string is created, and the original string remains unchanged.
		 * 
		 */
		String s1 = "Jashu";
		String s2 = "Vishnu";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		s1 = "reddy";
		System.out.println(System.identityHashCode(s1));
		
		
		StringBuffer sb1 = new StringBuffer("Abc");
		System.out.println(System.identityHashCode(sb1));
		sb1 = sb1.append("xyz");
		System.out.println(System.identityHashCode(sb1));
		System.out.println(sb1);
		
	}

}
