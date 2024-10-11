package methods;

public class InstanceMethodsDemo {
	public static void main(String[] args) {
		
		One one = new One();
//		one.display();
//		one.display(8);
//		int x = one.calc(8);
//		one.display(x);
//		one.display(one.calc(9, 4));
		One two = new One();
		
		System.out.println(two.x);//10
		System.out.println(two.x);//10
		two.x = two.x + 2;
		System.out.println(one.x);//10
		System.out.println(two.x);//12
		
	}
}

class One {
	
	int x = 10;
	//Without parameter and without return type 
	public void display()
	{
		System.out.println(x);
	}
	
	//With one parameter and without return type 
	public void display(int y)
	{
		System.out.println(y);
	}
	
	//With one parameter and with return type 
	public int calc(int z) {
		return (z*z);
	}
	
	//With two parameter and with return type 
	public int calc(int x, int y) {
		return (x*y);
	}
}
