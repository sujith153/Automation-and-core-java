package inheritance;

public class MainClass {

	public static void main(String[] args) {
		Sub1 obj = new Sub1();
		obj.add();
		Dup d = new Dup(23, 31, 32);
		d.dum();
//		Brand f = new Brand(324, 314);
		
	}

}
class Brand {
	int a,b;
	
	public void mul(int a , int b) {
		System.out.println(a*b);	
	}
	public Brand(int a, int b) {
		this.a =a;
		this.b = b;
		
		System.out.println(a+b);
		
	}
}
class Dup extends Brand{
	int c;
	public Dup(int a, int b, int c) {
		super(a, b);
		this.c = c;
		System.out.println(a+b+c);
		
	}

	public void dum () {
		mul(12, 21);
	}
	
}