package polymorphism;

public class PolymorphismOverLoading {
	
	public void add() {
		System.out.println("Zero parameters add function");
	}
	public void add(int a , int b) {
		System.out.println(a+b +" In 2 parameters add function");
	}
	public void add(int a , int b ,int c) {
		System.out.println(a+b+c + " In 3 parameters add function");
	}

	public static void main(String[] args) {
		PolymorphismOverLoading fun = new PolymorphismOverLoading();
		fun.add();
		fun.add(34, 323);
		fun.add(324, 34, 314);
		
	}
/**
 * In compile time polymorphism we are doing method over loading but the methods should have same name with
 * different parameters or the order of the parameters should be different 
 */

}
