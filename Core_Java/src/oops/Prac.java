package oops;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name = sc.nextLine();
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		New person = new New(age,name);
		person.print();
		sc.close();
	}
}

class New {
	int age ;
	String name;
	
	public New(int age,String name) {
		this.age =age;
		this.name= name;
	}
	public void print() {
		System.out.println("Your name is :" +  name);
		System.out.println("Your age is :" + age);
	}
}
