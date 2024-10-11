package methods;

import java.util.Arrays;

public class InstanceMethod {

	public static void main(String[] args) {
		Old nums = new Old();
		int b[] = nums.numbers(10);
		int a = nums.calc(8);
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		nums.printIntegerArray(b);
		String word = nums.getReverseString("bvvdsbvdsi");
		System.out.println(word);
		double number =nums.ptintDouble(5.4);
		System.out.println(number);
		char upperCase = nums.printChar('d');
		System.out.println(upperCase);
		boolean value =nums.printBooleanvalue(false);
		System.out.println(value);
		char[] stringToChar = nums.printStringIntoChar("udsbv");
		System.out.println(Arrays.toString(stringToChar) );
		String[] wordsIntoArray = nums.printString("uvnvnv csjnv sdvb");
		System.out.println(Arrays.toString(wordsIntoArray));

	}

}

//Write a program to return 1 to 10 numbers with parameterization
class Old {

	public int[] numbers(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
//			System.out.println(a[i]);
		}

		return a;
	}

	public int calc(int x) {
		return (x * x);
	}

	// Write a method to print integer array and it should accept as a parameter
	public void printIntegerArray(int x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	// Write a method to accept a string and reverse the string and return it
	// Write a method to accept a double value and it should return double value by
	// doing multiply
	// Write a method to accept a char and return the upper case char
	// Write a boolean to accept boolean and return opposite
	// write a method string return into chars

	public String getReverseString(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
	}

	public double ptintDouble(double d) {
		return d * d;
	}

	public char printChar(char a) {
		return Character.toUpperCase(a);
	}

	public boolean printBooleanvalue(boolean b) {
		return !b;
	}

	public char[] printStringIntoChar(String name) {
//		char[] jk = name.toCharArray();
		return name.toCharArray();
	}

	public String[] printString(String line) {
		return line.split(" ");
	}

}