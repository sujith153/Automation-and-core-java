package interview;

public class InterviewOfACcolite {
	public static void main(String[] args) {
		String name = "Sujith Vardhan Reddy";
		StringBuilder rev = new StringBuilder(name);
		System.out.println(rev.reverse());
		
		
		
		char revr[] = name.toCharArray();
		char re[] = new char[name.length()];
		for (int i = 0; i <revr.length; i++)
			re[revr.length-i-1] = revr[i];
		System.out.println(re);
	}
}
