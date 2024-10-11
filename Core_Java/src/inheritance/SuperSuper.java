package inheritance;

public class SuperSuper {
	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Sujith");
		st.setAge(24);
		st.setPercentage(75.78);
		st.displayStudentInfo();
		
		Teachers t = new Teachers();
		t.setName("venkat");
		t.setAge(38);
		t.setGender('M');
		t.setSalary(121312.234);
		t.displayTeacherInfo();

	}
}

class Person {
	String name;
	int age;
	char gender = 'M';

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void displayPersonInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender : " + gender);
	}
}

class Student extends Person {
	double percentage;

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void displayStudentInfo() {
		super.displayPersonInfo();
		System.out.println("percentage: " + percentage);
	}
}

class Teachers extends Person {
	double salary;

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void displayTeacherInfo() {
		super.displayPersonInfo();
		System.out.println("Salary of the teacher :" + salary);
	}
}
