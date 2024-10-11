package classess_objects;

public class ParameterizedConstructor {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter your name : ");
//		String name = s.nextLine();
//		System.out.print("Enter your age : ");
//		int age = s.nextInt();
//		PersonTwo jashu = new PersonTwo(name , age);
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		PersonTwo jashu = new PersonTwo(name, age);
		jashu.talk();
	}

}
class PersonTwo{
	//Properties 
	private String name ;
	private int age ;
	
	public PersonTwo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Action
	void talk() {
		System.out.println("Hello I am "+ name);
		System.out.println("My age is "+ age);
	}
}
