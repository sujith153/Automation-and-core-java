package inheritance;

public class Sub1 extends Super {
	public void log() {
		
		System.out.println("In Sub log");
		
	}
	public void add() {
		//super.add();
		System.out.println("In sub add");
	}
	
	public static void main(String[] args) {
		Sub1 su = new Sub1();
		su.add();
	}
}
