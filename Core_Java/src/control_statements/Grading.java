package control_statements;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks you have scored out of 100 :");
		
		int mark = sc.nextInt();
		
		if(mark<35) {
			System.out.println("You have failed the exam ");
		}
		if(mark==35) {
			System.out.println("You are passed");
		}
		if(mark>35 && mark<75) {
			System.out.println("You scored third class in the exam ");
		}
		if(mark>=75 && mark<85) {
			System.out.println("You scored second class in the exam ");
		}
		if(mark>=85 && mark<=100) {
			System.out.println("You scored first class in the exam ");
		}
		else {
			System.out.println("Orini nuvvu manishiva leda manava mruganiva raa nuvvu");
		}
		sc.close();
		
	}

}
