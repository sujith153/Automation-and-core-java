package inheritance.constructor;

public class InheritenceWithConstructor {
	public static void main(String[] args) {
		Teachers t = new Teachers("Suithh", 24, 'M', 78787.89);
		t.displayTeacherInfo();
		Student st = new Student("JAshu", 22, 'M', 95.8);
		st.display();

	}
}

class Person {
	String name;
	int age;
	char gender;

	public Person(String name, int age, char gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender : " + gender);
	}
}

class Student extends Person {
	double percentage;

	public Student(String name, int age, char gender, double percentage) {
		super(name, age, gender);
		this.percentage = percentage;
	}

	public void display() {
		super.display();
		System.out.println("percentage: " + percentage);
	}
}

class Teachers extends Person {
	double salary;

	public Teachers(String name, int age, char gender, double salary) {
		super(name, age, gender);
		this.salary = salary;
	}

	public void displayTeacherInfo() {
		super.display();
		System.out.println("Salary of the teacher :" + salary);
	}
}
