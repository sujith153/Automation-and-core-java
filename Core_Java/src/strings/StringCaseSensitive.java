package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringCaseSensitive {

	public static void main(String[] args) {
		System.out.print("Enter String : ");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String[] s2 = s1.split(" ");
		System.out.println(Arrays.toString(s2));//After splitting the words it will store in an array
		s.close();
		for (int i = 0; i < s2.length; i++) {//here we are accessing each word with index and incrementing it
			String x = s2[i];//here i am assigning the word to a string x
			if(i%2==0) {// even words to upper case .... here 1st i =0 means the index will start from 0
				System.out.print(x.toUpperCase()+ " ");
				
			}else {//odd words to reverse
				String reverse = "";
				for (int j = s2[i].length()-1 ; j >=0; --j) {
					reverse = reverse + s2[i].charAt(j);
				}
				System.out.print(reverse.toLowerCase()+ " ");
			}
		}
		
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.toUpperCase());

	}

}
