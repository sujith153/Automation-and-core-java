package abstractclass;

public class AbstractClassDemo {
	public static void main(String[] args) {
		One t = new Three();
		//Two t = new Two();
		int x = t.calc(6, 8);
		t.display(x);
		
	}
}

abstract class One {
	int x = 5, y = 2;
	
	abstract public int calc(int x, int y);
	
	public void display(int x) {
		System.out.println("From One X: "+x);
	}
	
}

class Two extends One {

	@Override
	public int calc(int x, int y) {
		
		return (x+y);
	}
	
}

class Three extends One {

	@Override
	public int calc(int x, int y) {
		return (x*y);
	}
	
	public void display(int x) {
		System.out.println("From Three X: "+x);
	}
	
}