package inheritance;

public class FinalClassDemo {

	public static void main(String[] args) {
		Two t  = new Two();
		t.multiply();
	}
}

class One {
	final int x = 10;
	int c = 32;

	final public void display() {
		System.out.println("X: " + x);
	}
}

class Two extends One {
	int y = 5 ;
	
	/**
	 * We can not extend final class 
	 * we can not modify the final method or variable
	 * 
	 */
	 

	void multiply() {
		c=123;
//		x= 123;
		System.out.println(c*x);
		
	}
//	public void display() {
//	System.out.println("X: "+ x);
//}
}

		

