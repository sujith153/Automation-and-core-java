package classess_objects;

public class ClassObject {
	public static void main(String[] args) {
		Person jashu = new Person();
		System.out.println(jashu.hashCode());
		//jashu.name = "Jashu1";
		//jashu.age = 24;
		jashu.talk();
	}

}

class Person{
	//Properties 
	private String name = "Jashu";
	private int age = 23;
	
	//Action
	void talk() {
		System.out.println("Hello I am "+ name);
		System.out.println("My age is "+ age);
	}
}