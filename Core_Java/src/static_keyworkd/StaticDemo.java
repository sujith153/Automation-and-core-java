package static_keyworkd;

public class StaticDemo {
	static int z = 23;
	static {
		z = 234;
	}
	public static void main(String[] args) {
		One o1 = new One();
		One o2 = new One();
//		m1();
		
		System.out.println("o1.X: "+o1.x);//10
		System.out.println("o2.X: "+o2.x);//10
		System.out.println("o1.y: "+One.y);//5
		System.out.println("o2.y: "+One.y);//5
		o1.x = o1.x + 1;
		One.y = One.y + 1;
		System.out.println("After Update");
		System.out.println("o1.X: "+o1.x);//11
		System.out.println("o2.X: "+o2.x);//10
		System.out.println("o1.y: "+One.y);//
		System.out.println("o2.y: "+One.y);//5
	}
}

class One {
	int x = 10;
	static int y = 5;
}

