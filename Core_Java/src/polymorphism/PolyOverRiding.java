package polymorphism;

public class PolyOverRiding extends PolymorphismOverLoading {
	
	@Override
	public void add() {
		System.out.println("In Over ride add ");
	}
	public void add(int as, String nam) {
		
	}

	public static void main(String[] args) {
		PolyOverRiding ride = new PolyOverRiding();
		ride.add();
		

	}
/**
 *  Here to achieve over riding we have to use inheritance and the parent class will have 
 *  some methods for example here we have add if we need to override the method 
 *  we will specify @override at top so that the java will check weather the method is 
 *  present in the parent class or not .
 *  the conditions for Over riding is both the methods should have same parameter and same odrer 
 *  if we create an instance for child class when call the function first it will check weather 
 *  the function is present in child class if not it will check the parent class and execute it
 *  @override is not manditory but if you mention , it will help you to implement correctly
*/

}
