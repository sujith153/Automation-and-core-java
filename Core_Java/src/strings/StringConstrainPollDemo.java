package strings;

public class StringConstrainPollDemo {
	public static void main(String[] args) {
		String s1 = new String("Venkat");
		String s2 = new String("Venkat");
		String s3 = "Venkat";
		String s4 = "Venkat";
		System.out.println(s1==s2);//f
		System.out.println(s1==s3);//f
		//s3 s4 will have same memory allocation
		System.out.println(s3==s4);//t
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	}
}
