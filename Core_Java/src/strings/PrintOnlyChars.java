package strings;

public class PrintOnlyChars {

	public static void main(String[] args) {
		String f = "fcndisa  ndn d enrwe fjle r32 3 vd k";
		StringBuilder s = new StringBuilder();
		for (Character g : f.toCharArray()) {
			if (Character.isLetter(g)) {
				s.append(g);
			}
		}
		System.out.println(s);
	}

}
