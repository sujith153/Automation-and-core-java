package strings;

public class DuplicatesInString {

	public static void main(String[] args) {
		//to remove duplicates in a String
		String name = "Sujith Vardhan Reddy";
		char[] chars = name.toLowerCase().toCharArray();
		int f = 0;
		for (int i = 0; i < chars.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (chars[i] == chars[j]) 
					break;
			}
			if (j == i) 
				chars[f++] = chars[i];
		}
		String result = new String(chars, 0, f);
		System.out.println(result);

		
		
		
		//Using String Builder
//		 String name = "Sujith Vardhan Reddy";
//	        StringBuilder uniqueChars = new StringBuilder();
//
//	        for (int i = 0; i < name.length(); i++) {
//	            char currentChar = name.charAt(i);
//	            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
//	                uniqueChars.append(currentChar);
//	            }
//	        }
//
//	        System.out.println("String after removing duplicates: " + uniqueChars.toString());

	}

}
