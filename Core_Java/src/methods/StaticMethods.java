package methods;

import java.util.Scanner;

public class StaticMethods {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter first numbers: ");
		int z = num.nextInt();
		System.out.print("Enter Second numbers: ");
		int a = num.nextInt();
		System.out.print("Addition : ");
		System.out.print(Two.add(a, z)); // mainly you need to understand we are
		num.close();									// not creating object for static methods
	}

}

//there is no need to create instances for static methods or variables 
//we can directly call with className. 
//we can not manipulate the static variables

//Write a program to add two numbers by using static method 
//and the numbers which you need to pass while running the program
class Two {

//	static int x = 9;

//	static int y = 4;
	public static int add(int x, int y) {
		return x + y;
	}
}