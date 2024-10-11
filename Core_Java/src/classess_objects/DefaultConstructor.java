package classess_objects;

public class DefaultConstructor {
	public static void main(String[] args) {
		PersonOne jashu = new PersonOne();
		jashu.talk();
	}

}
class PersonOne{
	//Properties 
	private String name ;
	private int age ;
	
	public PersonOne() {
		name = "Jashu";
		age = 23;
	}
	
	//Action
	void talk() {
		System.out.println("Hello I am "+ name);
		System.out.println("My age is "+ age);
	}
}