package oops;

public class OopsDemo {
	public static void main(String[] args) {
		Student ramu = new Student("Ramu", 50);
		Student krishana = new Student("krishana", 51);
		
		ramu.printStudentInfo();
		krishana.printStudentInfo();
	}
}
/**
 * 
 * @author Sujith
 *
 */

class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public void printStudentInfo() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Marks: "+marks);
	}
	
}
